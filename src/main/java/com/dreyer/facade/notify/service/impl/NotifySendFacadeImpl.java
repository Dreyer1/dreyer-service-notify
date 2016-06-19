package com.dreyer.facade.notify.service.impl;

import com.dreyer.common.config.PublicConfig;
import com.dreyer.common.params.MailParam;
import com.dreyer.facade.notify.entity.NotifyRecord;
import com.dreyer.facade.notify.enums.NotifyStatusEnum;
import com.dreyer.facade.notify.enums.NotifyTypeEnum;
import com.dreyer.facade.notify.service.NotifySendFacade;
import com.dreyer.facade.notify.util.NotifyUtil;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @author: Dreyer
 * @date: 16/6/18 下午10:00
 * @description: 向MQ发送消息的服务实现
 */
@Service("notifySendFacade")
public class NotifySendFacadeImpl implements NotifySendFacade {
    @Autowired
    private JmsTemplate notifyJmsTemplate;

    private Logger logger = Logger.getLogger(NotifySendFacadeImpl.class);

    /**
     * 通知的最大次数
     */
    private static final String NOTIFY_LIMIT = PublicConfig.NOTIFY_LIMIT;


    /**
     * 发送邮件通知
     *
     * @param mailParam
     */
    @Override
    public void sendMailNotify(final MailParam mailParam) {
        logger.info("开始发送邮件消息...");
        notifyJmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(NotifyUtil.formatMail(mailParam));
            }
        });
        logger.info("邮件发送结束...");
    }

    /**
     * 发送消息通知
     *
     * @param notifyUrl       通知地址
     * @param notifyTypeEnum  通知类型
     * @param merchantOrderNo 商户订单号
     * @param merchantNo      商户号
     */
    @Override
    public void notifySend(String notifyUrl, NotifyTypeEnum notifyTypeEnum, String merchantOrderNo, String merchantNo) {
        logger.info("notifySend param, nonotifyUrl:" + notifyUrl + ",notifyTypeEnum:" +
                notifyTypeEnum + ",merchantOrderNo" + merchantOrderNo + ",merchantNo" + merchantNo);
        NotifyRecord record = new NotifyRecord();
        record.setNotifyTimes(toShort(0));
        record.setLimitNotifyTimes(toShort(NOTIFY_LIMIT));
        record.setStatus(toShort(NotifyStatusEnum.CREATED.getValue()));
        record.setUrl(notifyUrl);
        record.setMerchantOrderNo(merchantOrderNo);
        record.setMerchantNo(merchantNo);
        record.setNotifyType(toShort(notifyTypeEnum.getValue()));

        final String str = JSONObject.fromObject(record).toString();

        notifyJmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(str);
            }
        });
    }


    /**
     * @param val
     * @return
     */
    private Short toShort(Integer val) {
        return new Short(val.toString());
    }

    /**
     * @param val
     * @return
     */
    private Short toShort(String val) {
        return new Short(val);
    }
}

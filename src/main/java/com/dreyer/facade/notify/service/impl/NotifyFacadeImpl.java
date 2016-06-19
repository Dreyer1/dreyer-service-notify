package com.dreyer.facade.notify.service.impl;

import com.dreyer.common.page.PageParam;
import com.dreyer.common.page.Pager;
import com.dreyer.common.params.MailParam;
import com.dreyer.core.notify.biz.NotifyBiz;
import com.dreyer.core.notify.dao.NotifyRecordLogMapper;
import com.dreyer.core.notify.dao.NotifyRecordMapper;
import com.dreyer.facade.notify.entity.NotifyRecord;
import com.dreyer.facade.notify.entity.NotifyRecordLog;
import com.dreyer.facade.notify.service.NotifyFacade;
import com.dreyer.facade.notify.util.NotifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dreyer
 * @date: 16/6/16 上午11:50
 * @description: 通知服务实现
 */
@Service("notifyFacade")
public class NotifyFacadeImpl implements NotifyFacade {
    @Autowired
    private NotifyRecordMapper notifyRecordMapper;

    @Autowired
    private NotifyRecordLogMapper notifyRecordLogMapper;

    /**
     * 查询商户通知记录.<br/>
     *
     * @param id
     * @return
     */
    public NotifyRecord getNotifyById(Long id) {
        return notifyRecordMapper.selectByPrimaryKey(id);
    }

    /**
     * 创建商户通知记录.<br/>
     */
    public long creatNotifyRecord(NotifyRecord notifyRecord) {
        return notifyRecordMapper.insertSelective(notifyRecord);
    }

    /**
     * 更新商户通知记录.<br/>
     */
    public long updateNotifyRecord(NotifyRecord notifyRecord) {
        return notifyRecordMapper.updateByPrimaryKeySelective(notifyRecord);
    }

    /**
     * 创建商户通知日志记录.<br/>
     */
    public long creatNotifyRecordLog(NotifyRecordLog notifyRecordLog) {
        return notifyRecordLogMapper.insert(notifyRecordLog);
    }


//	/**
//	 * 查询商户通知记录.<br/>
//	 *
//	 * @param merchantNo
//	 *            商户编号.
//	 * @param merchantOrderNo
//	 *            商户订单号.
//	 * @return notifyType.
//	 *            通知类型
//	 */
//	public NotifyRecord getNotifyByMerchantNoAndMerchantOrderNoAndNotifyType(String merchantNo, String merchantOrderNo, Integer notifyType) {
//		return notifyBiz.getNotifyByMerchantNoAndMerchantOrderNoAndNotifyType(merchantNo, merchantOrderNo, notifyType);
//	}


    /**
     * 根据传入参数分页查询
     *
     * @param pageParam 分页参数
     * @param paramMap  查询参数
     * @return 查询结果
     */
    public Pager<NotifyRecord> queryNotifyRecordListPage(PageParam pageParam, Map<String, Object> paramMap) {
        if (paramMap == null) {
            paramMap = new HashMap<String, Object>();
        }
        if (pageParam == null) {
            pageParam = new PageParam();
        }
        paramMap.put("page", pageParam.getPageStart());
        paramMap.put("size", pageParam.getPageSize());
        Pager<NotifyRecord> pager = new Pager<NotifyRecord>();
        pager.setCurrentPageIndex(pageParam.getCurrentPageIndex());
        pager.setPageSize(pageParam.getPageSize());
        pager.setPageData(notifyRecordMapper.listPage(paramMap));
        pager.setTotal(notifyRecordMapper.listPageCount(paramMap));
        return pager;
    }
//
//	/**
//	 * 根据传入参数分页查询
//	 *
//	 * @param pageParam
//	 *            分页参数
//	 * @param paramMap
//	 *            查询参数
//	 * @return 查询结果
//	 */
//	public PageBean queryNotifyRecordLogListPage(PageParam pageParam, Map<String, Object> paramMap) {
//		return notifyBiz.queryNotifyRecordLogListPage(pageParam, paramMap);
//	}


}

package com.dreyer.notify;

import com.dreyer.common.params.MailParam;
import com.dreyer.facade.notify.entity.NotifyRecord;
import com.dreyer.facade.notify.service.NotifyFacade;
import com.dreyer.facade.notify.service.NotifySendFacade;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description
 * @author: Dreyer
 * @date: 16/6/15 下午10:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
public class Test {
    @Autowired
    private NotifyFacade notifyFacade;
    @Autowired
    private NotifySendFacade notifySendFacade;

    @org.junit.Test
    public void test() {
        NotifyRecord notifyRecord = notifyFacade.getNotifyById(Long.parseLong("12"));
        System.out.println(notifyRecord == null);
    }

    @org.junit.Test
    public void sendNotify() {
        System.out.println(notifySendFacade == null);
        MailParam mailParam = new MailParam("aaa","bbb","ccc");
        notifySendFacade.sendMailNotify(mailParam);

    }

}

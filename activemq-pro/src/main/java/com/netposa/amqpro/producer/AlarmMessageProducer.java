package com.netposa.amqpro.producer;

import com.netposa.amqpro.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.util.HashMap;

/**
 * Created by dlut_coco on 2017/8/1.
 */
//@Component
public class AlarmMessageProducer {


    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Config config;

    @Scheduled(fixedRate = 5000)
    public void producer() throws JMSException {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("type", (int) Math.random() * 3);
        jmsMessagingTemplate.convertAndSend(config.getTopic(), Math.random(), headers);
    }
}

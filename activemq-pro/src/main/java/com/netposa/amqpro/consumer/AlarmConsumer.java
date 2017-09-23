package com.netposa.amqpro.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by dlut_coco on 2017/8/1.
 */
@Slf4j
@Component
public class AlarmConsumer {

    @JmsListener(destination = "${mq.topic}")
    public void consumer1(String message) {
        log.info("consumer1, {}", message);
    }

}

package com.netposa.amqpro.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dlut_coco on 2017/9/11.
 */
@Component
@ConfigurationProperties(prefix = "mq")
@Data
public class Config {

    private String topic;
}

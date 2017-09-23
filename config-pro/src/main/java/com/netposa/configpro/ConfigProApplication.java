package com.netposa.configpro;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableApolloConfig
@Slf4j
public class ConfigProApplication {

    @Value("${test.ip}")
    private String ip;

    @Value("${spring.redis.host}")
    private String redishost;

    @Value("${test.ipp}")
    private String testipp;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ConfigProApplication.class, args);
    }

    @Scheduled(fixedRate = 50000)
    public void test() {
        log.info("ip:" + ip);
        log.info("redishost:" + redishost);
        log.info("testipp:" + testipp);
        log.info("ip:" + env.getProperty("test.ip"));
        log.info("redishost:" + env.getProperty("spring.redis.host"));
        log.info("testipp:" + env.getProperty("test.ipp"));
    }
}

package com.jndx.trade;

import com.jndx.api.config.OpenfeignLoggerConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.jndx.trade.mapper")
@SpringBootApplication
@EnableFeignClients(value = "com.jndx.api.client", defaultConfiguration = OpenfeignLoggerConfig.class)
public class TradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradeApplication.class, args);
    }
}
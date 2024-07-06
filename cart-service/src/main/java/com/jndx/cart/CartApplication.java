package com.jndx.cart;

import com.jndx.api.config.OpenfeignLoggerConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.jndx.cart.mapper")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.jndx.api.client",defaultConfiguration = OpenfeignLoggerConfig.class)
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class, args);
    }
}
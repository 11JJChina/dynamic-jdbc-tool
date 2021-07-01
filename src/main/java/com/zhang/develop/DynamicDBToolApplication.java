package com.zhang.develop;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: ZhangGuowen
 * @Title: DynamicDBToolApplication
 * @ProjectName: dynamic-jdbc-tool
 * @Description:
 * @date: 2021/6/30 23:21
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class DynamicDBToolApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicDBToolApplication.class, args);
    }
}

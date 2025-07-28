package com.tariq.BlogBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.tariq")
@EnableDiscoveryClient
public class BlogBeApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlogBeApplication.class, args);
    }

}

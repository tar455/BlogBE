package com.tariq.BlogBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.tariq","com.tariq.exception"})
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = {"com.tariq.repository"})
@EntityScan(basePackages = "com.tariq.model")
public class BlogBeApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlogBeApplication.class, args);
    }

}

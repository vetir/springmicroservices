package org.java.microservices.eurekafirstclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaFirstClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFirstClientApplication.class, args);
    }

}

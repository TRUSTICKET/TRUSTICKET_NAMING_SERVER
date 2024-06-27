package com.trusticket.trusticket_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrusticketDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrusticketDiscoveryApplication.class, args);
    }

}

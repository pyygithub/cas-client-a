package com.thtf.casclienta;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class CasClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientAApplication.class, args);
    }

}

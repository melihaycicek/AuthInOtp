package com.system.authinotp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"com.system.authinotp"})
@SpringBootApplication

public class AuthInOtpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthInOtpApplication.class, args);
    }

}

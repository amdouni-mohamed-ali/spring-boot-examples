package org.spring.boot.examples.emails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendGridApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendGridApplication.class, args).close();
    }
}

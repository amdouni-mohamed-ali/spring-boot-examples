package org.spring.boot.examples.web.rest.producer.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWTApplication {

    public static void main(String[] args) {

        //source : https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-2/
        //you can find the postman collection of this project in the test resources
        SpringApplication.run(JWTApplication.class, args);
    }
}

package org.spring.boot.examples.profiles.maven.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SmtpMailSender implements MailSender {

    /*
     * this is a static logger
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(SmtpMailSender.class);

    @Override
    public void send(String to, String object, String message) {

        LOGGER.info("Sending an SMTP mail ...");
        LOGGER.info("to : {} , object : {}", to, object);
        LOGGER.info("message : {}", message);
        LOGGER.info("operation terminated successfully.");
    }
}

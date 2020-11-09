package com.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private SmsService smsService;

    @Test
    void contextLoads() {
        System.out.println("asdasd");
    }

    @Test
    void sendSms() throws JsonProcessingException, ParseException, UnsupportedEncodingException, URISyntaxException, NoSuchAlgorithmException, InvalidKeyException {
        smsService.sendSms("01011112222","오예");
    }

}

package com.example.nobodycanstopusb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//잘되나요
@EnableJpaAuditing
@SpringBootApplication
public class NobodycanstopusBApplication {

    public static void main(String[] args) {
        SpringApplication.run(NobodycanstopusBApplication.class, args);
    }

}

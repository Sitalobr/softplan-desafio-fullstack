package br.com.sitalobr.dev.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class Application {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("Brazil/East"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

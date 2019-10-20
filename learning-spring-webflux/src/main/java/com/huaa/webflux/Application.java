package com.huaa.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 19:50
 */
@SpringBootApplication
@EnableWebFlux
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

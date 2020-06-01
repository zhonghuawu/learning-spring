package com.huaa.webflux;

import com.google.common.collect.Lists;
import com.huaa.webflux.entity.User;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.netty.http.client.HttpClient;

import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 21:08
 */
public class WebClientTest {

    public static void main(String[] args) {
//        HttpClient httpClient = HttpClient.create();
        WebClient client = WebClient.builder().baseUrl("http://localhost:8080")
//                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();

        Flux<User> userFlux = client.get()
                .uri("/api/users").retrieve()
                .bodyToFlux(User.class);
        System.out.println("----------");
        List<User> userList = Lists.newArrayList();
        userFlux.subscribe(System.out::println);
        userFlux.subscribe(userList::add);
        System.out.println(userList);
        System.out.println("----------");

    }
}

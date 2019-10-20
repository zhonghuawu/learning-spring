package com.huaa.webflux.handler;

import com.huaa.webflux.entity.User;
import com.huaa.webflux.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNullApi;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 19:59
 */
@Slf4j
@Component
public class UserHandler {
    @Autowired
    private UserService userService;

    public Mono<ServerResponse> getUserList(ServerRequest request) {
        Flux<User> userFlux = userService.findUserList();
        userFlux.subscribe(user -> log.info(user.toString()));
        return ServerResponse.ok().body(userFlux, User.class);
    }

    public Mono<ServerResponse> getUser(ServerRequest request) {
        String userId = request.pathVariable("userId");
        Mono<User> userMono = userService.findByUserId(userId);
        userMono.subscribe(user -> log.info(user.toString()));
        return ServerResponse.ok().body(userMono, User.class);
    }
}

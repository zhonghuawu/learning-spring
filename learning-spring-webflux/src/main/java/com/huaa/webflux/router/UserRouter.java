package com.huaa.webflux.router;

import com.huaa.webflux.handler.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 20:04
 */
@Configuration
public class UserRouter {

    @Bean
    @Autowired
    public RouterFunction<ServerResponse> routersFunction(UserHandler userHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/api/users"), userHandler::getUserList)
                .and(RouterFunctions.route(RequestPredicates.GET("/api/user/{userId}"), userHandler::getUser));
    }

}

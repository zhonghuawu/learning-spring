package com.huaa.webflux.service;

import com.google.common.collect.Maps;
import com.huaa.webflux.entity.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 19:51
 */
@Component
public class UserService {

    private Map<String, User> userMap = Maps.newConcurrentMap();

    public void setUser(String userId, User user) {
        userMap.put(userId, user);
    }

    public Mono<User> findByUserId(String userId) {
        User user = userMap.getOrDefault(userId, new User("huaa", 24));
        return Mono.just(user);
    }

    public Flux<User> findUserList() {
        List<User> userList = new ArrayList<>(userMap.values());
        return Flux.fromStream(userList::stream);
    }

}

package com.huaa.webflux.init;

import com.huaa.webflux.entity.User;
import com.huaa.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/20 20:10
 */
@Component
public class Init implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.setUser("1", new User("carlos", 18));
        userService.setUser("2", new User("lisa", 19));
        userService.setUser("3", new User("mike", 17));
        userService.setUser("4", new User("tom", 16));
        userService.setUser("5", new User("amy", 15));
    }
    
}

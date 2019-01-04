package com.kominfo.halaqohit.springbootdatajpaexample.controller;

import com.kominfo.halaqohit.springbootdatajpaexample.entity.User;
import com.kominfo.halaqohit.springbootdatajpaexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jpa-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-05
 * Time: 05:17
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
}

package com.stephen.book.controller;

import com.stephen.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ssc on 2020-09-02 17:02 .
 * Description:
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Object login(@RequestParam String username,
                        @RequestParam String password) {
        return userService.login(username,password);
    }


}

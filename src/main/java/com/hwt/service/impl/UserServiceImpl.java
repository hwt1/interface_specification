package com.hwt.service.impl;

import com.hwt.entity.User;
import com.hwt.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 黄雯婷
 * @version 1.0
 * @description: TODO
 * @date 2020-08-24 14:21:40
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user) {
        System.out.println("==========="+user);
    }
}

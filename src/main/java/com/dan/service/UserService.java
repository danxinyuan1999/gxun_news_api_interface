package com.dan.service;

import com.dan.mbg.model.User;

/**
 * 用户接口
 *
 * @author dan
 */
public interface UserService {

    int register(User user);

    int login(String username, String password);

}

package com.dan.service.impl;

import com.dan.mbg.mapper.UserMapper;
import com.dan.mbg.model.User;
import com.dan.mbg.model.UserExample;
import com.dan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService实现类
 *
 * @author dan
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int login(String username, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() == 0) {
            return 0;
        }
        return 1;
    }
}

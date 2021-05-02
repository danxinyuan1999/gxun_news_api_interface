package com.dan.controller;

import com.dan.api.ApiResult;
import com.dan.mbg.model.User;
import com.dan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户Api接口
 *
 * @author dan
 */
@RestController
@Api("UserController")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public ApiResult register(@RequestBody User user) {
        ApiResult apiResult;
        int result = userService.register(user);
        if (result > 0) {
            apiResult = ApiResult.success(result);
        } else {
            apiResult = ApiResult.failed();
        }
        return apiResult;
    }

    @GetMapping("/login")
    @ApiOperation("用户登录")
    public ApiResult login(String username, String password) {
        ApiResult apiResult;
        int result = userService.login(username, password);
        if (result > 0) {
            apiResult = ApiResult.success(result);
        } else {
            apiResult = ApiResult.failed("登录失败，请检查账号名和密码");
        }
        return apiResult;
    }
}

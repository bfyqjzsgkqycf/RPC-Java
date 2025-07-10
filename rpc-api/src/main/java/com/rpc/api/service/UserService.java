package com.rpc.api.service;


import com.rpc.api.annotation.Retryable;
import com.rpc.api.pojo.User;

public interface UserService {

    // 查询
    @Retryable
    User getUserByUserId(Integer id);

    // 新增
    @Retryable
    Integer insertUserId(User user);
}

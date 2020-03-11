package com.ywf.mybatis.service;

import com.ywf.mybatis.entity.User;

import java.util.List;

/**
 * @Author:ywf
 */
public interface IUserService {

    /**
     * 查询所有用户
     * @return 用户列表
     */
    List<User> findAll();

    /**
     * 根据id 获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    User getById(int id);

    /**
     * 新增用户
     * @param user 用户信息
     * @return
     */
    int insert(User user);

    /**
     * 根据id 删除用户
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return
     */
    int update(User user);
}

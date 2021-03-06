package com.ywf.mybatis.service.impl;

import com.ywf.mybatis.entity.User;
import com.ywf.mybatis.mapper.IUserMapper;
import com.ywf.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:ywf
 */
@Service
@Transactional(isolation = Isolation.DEFAULT, rollbackFor = Error.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

//    @Autowired
//    private IUserAnnotationMapper userMapper;

    @Override
    public List<User> findAll() {
        userMapper.findAll();
        User u = new User();
        u.setUserName("new");
        userMapper.insert(u);
        return userMapper.findAll();
    }

    @Override
    public User getById(int id) {
        return userMapper.getById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }
}

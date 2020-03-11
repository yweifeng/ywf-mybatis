package com.ywf.mybatis.service.impl;

import com.ywf.mybatis.entity.Employ;
import com.ywf.mybatis.mapper.IEmployMapper;
import com.ywf.mybatis.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ywf
 */
@Service
public class EmployServiceImpl implements IEmployService {

    @Autowired
    private IEmployMapper employMapper;

    @Override
    public List<Employ> findAll() {
        return employMapper.findAll();
    }
}

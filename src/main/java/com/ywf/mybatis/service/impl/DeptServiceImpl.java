package com.ywf.mybatis.service.impl;

import com.ywf.mybatis.entity.Dept;
import com.ywf.mybatis.mapper.IDeptMapper;
import com.ywf.mybatis.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ywf
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}

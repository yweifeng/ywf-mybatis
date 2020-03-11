package com.ywf.mybatis.service;

import com.ywf.mybatis.entity.Dept;

import java.util.List;

/**
 * @Author:ywf
 */
public interface IDeptService {

    /**
     * 获取部门信息，包含该部门底下的员工信息
     * @return
     */
    List<Dept> findAll();
}

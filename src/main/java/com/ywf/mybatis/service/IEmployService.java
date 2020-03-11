package com.ywf.mybatis.service;

import com.ywf.mybatis.entity.Dept;
import com.ywf.mybatis.entity.Employ;

import java.util.List;

/**
 * @Author:ywf
 */
public interface IEmployService {

    /**
     * 获取员工信息，包含员工所属部门信息
     * @return
     */
    List<Employ> findAll();
}

package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IDeptMapper {

    /**
     * 获取部门信息，包含该部门底下的员工信息
     * @return
     */
    List<Dept> findAll();
}

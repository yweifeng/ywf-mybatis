package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Employ;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IEmployMapper {
    /**
     * 获取员工信息，包含员工所属部门信息
     * @return
     */
    List<Employ> findAll();
}

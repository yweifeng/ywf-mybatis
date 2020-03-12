package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Employ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 根据部门Id 获取员工信息
     * @param deptId 部门ID
     * @return
     */
    List<Employ> findByDeptId(@Param("deptId") int deptId);

    /**
     * 获取员工信息，延迟加载所属部门信息
     * @return
     */
    List<Employ> lazyFindAll();
}

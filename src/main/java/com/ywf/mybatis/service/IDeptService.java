package com.ywf.mybatis.service;

import com.ywf.mybatis.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author:ywf
 */
public interface IDeptService {

    /**
     * 获取部门信息，包含该部门底下的员工信息
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据部门名称获取部门列表信息
     * @param deptName 部门名称
     * @return
     */
    List<Dept> findList(String deptName);

    /**
     * 根据id数组查询部门列表
     * @param idArray
     * @return
     */
    List<Dept> findByForeach(int[] idArray);

    /**
     * 根据id List查询部门列表
     * @param idList
     * @return
     */
    List<Dept> findByForeach(List idList);

    /**
     * 根据id Map查询部门列表
     * @param idMap
     * @return
     */
    List<Dept> findByForeach(Map idMap);

    /**
     * 根据Ids 和 部门名称查询
     * @param queryMap
     * @return
     */
    List<Dept> findByIdsAndDeptName(Map queryMap);
}

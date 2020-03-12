package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据部门名称获取部门列表信息
     * @param deptName 部门名称
     * @return
     */
    List<Dept> findList(@Param("deptName") String deptName);

    /**
     * 根据id数组查询部门列表
     * @param idArray
     * @return
     */
    List<Dept> findByForeachArray(@Param("idArray") int[] idArray);

    /**
     * 根据id List查询部门列表
     * @param idList
     * @return
     */
    List<Dept> findByForeachList(@Param("idList") List idList);

    /**
     * 根据id Map查询部门列表
     * @param idMap
     * @return
     */
    List<Dept> findByForeachMap(@Param("idMap") Map idMap);

    /**
     * 根据Ids 和 部门名称查询
     * @param queryMap
     * @return
     */
    List<Dept> findByIdsAndDeptName(@Param("queryMap") Map queryMap);

    /**
     * 加载部门信息，延迟加载用户信息
     * @return
     */
    List<Dept> lazyFindAll();

    /**
     * 根据部门id获取部门详情
     * @param id
     * @return
     */
    Dept getById(@Param("id") int id);
}

package com.ywf.mybatis.mapper.annotation;

import com.ywf.mybatis.entity.Dept;
import com.ywf.mybatis.entity.Employ;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IDeptAnnotationMapper {

    /**
     * 获取部门信息，包含该部门底下的员工信息
     * @return
     */
    @Select("SELECT * FROM dept")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "deptName", column = "dept_name"),
            @Result(property = "employList", javaType = List.class, column = "id",
                    many = @Many(select = "com.ywf.mybatis.mapper.annotation.IEmployAnnotationMapper.findByDeptId"))
    })
    List<Dept> findAll();

    /**
     * 根据ID获取部门信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM dept where id = #{id}")
    Dept getById(int id);
}

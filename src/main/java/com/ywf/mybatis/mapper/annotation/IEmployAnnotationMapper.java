package com.ywf.mybatis.mapper.annotation;

import com.ywf.mybatis.entity.Employ;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IEmployAnnotationMapper {
    /**
     * 根据部门ID 查询员工信息
     * @param deptId 部门ID
     * @return
     */
    @Select("SELECT * FROM employ WHERE dept_id = #{deptId}")
    List<Employ> findByDeptId(int deptId);

    /**
     * 获取所有员工信息，包含员工的部门信息
     * @return
     */
    @Select("SELECT * FROM employ")
    @Results({
            @Result(column = "dept_id", property = "dept",
                    one = @One(select = "com.ywf.mybatis.mapper.annotation.IDeptAnnotationMapper.getById"))
    })
    List<Employ> findAll();
}

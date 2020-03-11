package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IStudentMapper {

    /**
     * 获取所有学生信息，包含学生学习的课程信息
     * @return
     */
    List<Student> findAll();
}

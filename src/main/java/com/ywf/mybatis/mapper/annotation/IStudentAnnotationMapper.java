package com.ywf.mybatis.mapper.annotation;

import com.ywf.mybatis.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IStudentAnnotationMapper {

    /**
     * 获取所有学生信息，包含学生学习的课程信息
     * @return
     */
    @Select("SELECT * FROM student")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "student_name", property = "studentName"),
            @Result(column = "id", property = "courseList",
                many = @Many(select = "com.ywf.mybatis.mapper.annotation.ICourseAnnotationMapper.selectByStudentId"))
    })
    List<Student> findAll();
}

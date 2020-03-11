package com.ywf.mybatis.mapper.annotation;

import com.ywf.mybatis.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:ywf
 */
@Mapper
public interface ICourseAnnotationMapper {

    /**
     * 根据课程ID获取课程信息
     * @param studentId 学生id
     * @return
     */
    @Select("SELECT * FROM course WHERE id IN (SELECT course_id FROM student_to_course WHERE student_id = #{student_id})")
    Course selectByStudentId(int studentId);
}

package com.ywf.mybatis.service;

import com.ywf.mybatis.entity.Student;

import java.util.List;

/**
 * @Author:ywf
 */
public interface IStudentService {

    /**
     * 获取所有学生信息，包含学生学习的课程信息
     * @return
     */
    List<Student> findAll();
}

package com.ywf.mybatis.service.impl;

import com.ywf.mybatis.entity.Student;
import com.ywf.mybatis.mapper.IStudentMapper;
import com.ywf.mybatis.mapper.annotation.IStudentAnnotationMapper;
import com.ywf.mybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ywf
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
//    private IStudentMapper studentMapper;
    private IStudentAnnotationMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}

package com.ywf.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ywf
 */
public class Student {
    private int id;
    private String studentName;
    List<Course> courseList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}

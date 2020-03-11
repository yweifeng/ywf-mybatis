package com.ywf.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ywf
 */
public class Course {
    private int id;
    private String courseName;
    List<Student> studentList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

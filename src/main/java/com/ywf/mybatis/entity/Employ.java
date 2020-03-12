package com.ywf.mybatis.entity;

/**
 * @Author:ywf
 */
public class Employ {
    private int id;
    private String employName;
    private Dept dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

//    @Override
//    public String toString() {
//        return "Employ{" +
//                "id=" + id +
//                ", employName='" + employName + '\'' +
//                ", dept=" + dept +
//                '}';
//    }
}

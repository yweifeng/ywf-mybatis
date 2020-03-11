package com.ywf.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ywf
 */
public class Dept {
    private int id;
    private String deptName;
    List<Employ> employList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employ> getEmployList() {
        return employList;
    }

    public void setEmployList(List<Employ> employList) {
        this.employList = employList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", employList=" + employList +
                '}';
    }
}

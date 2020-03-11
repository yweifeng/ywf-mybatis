package com.ywf.mybatis.service.impl;

import com.ywf.mybatis.entity.Dept;
import com.ywf.mybatis.mapper.IDeptMapper;
import com.ywf.mybatis.mapper.annotation.IDeptAnnotationMapper;
import com.ywf.mybatis.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author:ywf
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptMapper deptMapper;
//    private IDeptAnnotationMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public List<Dept> findList(String deptName) {
        return deptMapper.findList(deptName);
    }

    @Override
    public List<Dept> findByForeach(int[] idArray) {
        return deptMapper.findByForeachArray(idArray);
    }

    @Override
    public List<Dept> findByForeach(List idList) {
        return deptMapper.findByForeachList(idList);
    }

    @Override
    public List<Dept> findByForeach(Map idMap) {
        return deptMapper.findByForeachMap(idMap);
    }

    @Override
    public List<Dept> findByIdsAndDeptName(Map queryMap) {
        return deptMapper.findByIdsAndDeptName(queryMap);
    }
}

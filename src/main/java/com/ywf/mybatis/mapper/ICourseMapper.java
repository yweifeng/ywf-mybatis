package com.ywf.mybatis.mapper;

import com.ywf.mybatis.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:ywf
 */
@Mapper
public interface ICourseMapper {

    /**
     * 根据ID获取课程详情
     * @param id 课程ID
     * @return
     */
    Course getById(@Param("id") int id);
}

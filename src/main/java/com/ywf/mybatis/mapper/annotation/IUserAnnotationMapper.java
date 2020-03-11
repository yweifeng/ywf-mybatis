package com.ywf.mybatis.mapper.annotation;

import com.ywf.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:ywf
 */
@Mapper
public interface IUserAnnotationMapper {
    /**
     * 查询所有用户
     * @return 用户列表
     */
    @Select("SELECT * FROM user")
    List<User> findAll();

    /**
     * 根据id 获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    @Select("SELECT * FROM user WHERE id = #{id} ")
    User getById(int id);

    /**
     * 新增用户
     * @param user 用户信息
     * @return
     */
    @Insert("INSERT INTO user(user_name, user_password) VALUES(#{userName}, #{userPassword}) ")
    int insert(User user);

    /**
     * 根据id 删除用户
     * @param id
     * @return
     */
    @Delete("DELETE FROM user WHERE id = #{id}")
    int delete(int id);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return
     */
    @Update("UPDATE user SET user_name = #{userName}, user_password = #{userPassword} WHERE id = #{id}")
    int update(User user);
}

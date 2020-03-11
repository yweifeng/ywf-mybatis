package com.ywf.mybatis;

import com.ywf.mybatis.entity.Dept;
import com.ywf.mybatis.entity.Employ;
import com.ywf.mybatis.entity.Student;
import com.ywf.mybatis.entity.User;
import com.ywf.mybatis.service.IDeptService;
import com.ywf.mybatis.service.IEmployService;
import com.ywf.mybatis.service.IStudentService;
import com.ywf.mybatis.service.IUserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IUserService userService;

    @Autowired
    private IDeptService deptService;

    @Autowired
    private IEmployService employService;

    @Autowired
    private IStudentService studentService;

    @Test
    void findAll() {
        List<User> userList = userService.findAll();
        log.info(userList.toString());
    }

    @Test
    void getById() {
        User user = userService.getById(1);
        log.info(user.toString());
    }

    @Test
    void insert() {
        User user = new User();
        user.setUserName("yang");
        user.setUserPassword("1");
        int res = userService.insert(user);
        log.info(String.valueOf(res));
    }

    @Test
    void update() {
        User user = new User();
        user.setId(1);
        user.setUserName("ywf update");
        int res = userService.update(user);
        log.info(String.valueOf(res));
    }

    @Test
    void delete() {
        int res = userService.delete(1);
        log.info(String.valueOf(res));
    }

    /**
     * 一对多关联
     */
    @Test
    void one2Many() {
        List<Dept> deptList = deptService.findAll();
        log.info(deptList.toString());
    }

    /**
     * 多对一关联
     */
    @Test
    void many2One() {
        List<Employ> employList = employService.findAll();
        log.info(employList.toString());
    }

    /**
     * 多对多关联
     */
    @Test
    void many2Many() {
        List<Student> studentList = studentService.findAll();
        log.info(studentList.toString());
    }
}

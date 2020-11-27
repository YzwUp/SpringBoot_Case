package com.atguigu.test;


import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> userList = userMapper.selectAll();
        System.out.println("userList = " + userList);

    }
}

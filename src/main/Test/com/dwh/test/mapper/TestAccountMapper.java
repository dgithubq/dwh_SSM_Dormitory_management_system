package com.dwh.test.mapper;

import com.dwh.entity.SystemAdmin;
import com.dwh.mapper.SystemAdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAccountMapper {
    @Autowired
    private SystemAdminMapper mapper;
    @Test
    public void test(){
        SystemAdmin byUsername = mapper.findByUsername("123");
        System.out.println("byUsername = " + byUsername);
    }
}

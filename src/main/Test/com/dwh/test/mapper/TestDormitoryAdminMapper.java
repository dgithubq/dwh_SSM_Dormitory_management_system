package com.dwh.test.mapper;

import com.dwh.entity.DormitoryAdmin;
import com.dwh.mapper.DormitoryAdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDormitoryAdminMapper {
    @Autowired
    private DormitoryAdminMapper dormitoryAdminMapper;
    @Test
    public void testList(){
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminMapper.list();
        System.out.println("dormitoryAdmins = " + dormitoryAdmins);
    }
    @Test
    public void testSearchByUsername(){
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminMapper.searchByUsername("ll");
        System.out.println("dormitoryAdmins = " + dormitoryAdmins);
    }
    @Test
    public void testSearchByTelephone(){
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminMapper.searchByTelephone("13612345678");
        System.out.println("dormitoryAdmins = " + dormitoryAdmins);
    }
    @Test
    public void testSearchByName(){
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminMapper.searchByName("张三");
        System.out.println("dormitoryAdmins = " + dormitoryAdmins);
    }
}

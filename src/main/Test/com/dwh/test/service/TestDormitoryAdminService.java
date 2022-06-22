package com.dwh.test.service;

import com.dwh.entity.DormitoryAdmin;
import com.dwh.service.DormitoryAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDormitoryAdminService {
    @Autowired
    private DormitoryAdminService dormitoryAdminService;
    @Test
    public void testList(){
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminService.list();
        System.out.println("dormitoryAdmins = " + dormitoryAdmins);
    }
}

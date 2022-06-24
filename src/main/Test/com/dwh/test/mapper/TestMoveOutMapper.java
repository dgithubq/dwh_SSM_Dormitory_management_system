package com.dwh.test.mapper;

import com.dwh.entity.MoveOut;
import com.dwh.mapper.MoveOutMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMoveOutMapper {
    @Autowired
    private MoveOutMapper moveOutMapper;
    @Test
    public void testList(){
        List<MoveOut> list = moveOutMapper.list();
        System.out.println("list = " + list);
    }
}

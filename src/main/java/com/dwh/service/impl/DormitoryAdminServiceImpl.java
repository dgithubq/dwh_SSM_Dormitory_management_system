package com.dwh.service.impl;

import com.dwh.entity.DormitoryAdmin;
import com.dwh.mapper.DormitoryAdminMapper;
import com.dwh.service.DormitoryAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dormitoryAdminService")
public class DormitoryAdminServiceImpl implements DormitoryAdminService {
    @Autowired
    private DormitoryAdminMapper dormitoryAdminMapper;
    @Override
    public List<DormitoryAdmin> list() {
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminMapper.list();
        return dormitoryAdmins;
    }
}

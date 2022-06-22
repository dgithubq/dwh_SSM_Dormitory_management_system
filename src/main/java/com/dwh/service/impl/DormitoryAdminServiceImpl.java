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

    @Override
    public List<DormitoryAdmin> search(String key, String value) {
        if (key.equals("")){
            List<DormitoryAdmin> list = dormitoryAdminMapper.list();
            return list;
        }
        List<DormitoryAdmin> list = null;
        switch (key){
            case "name":
                list = dormitoryAdminMapper.searchByName(value);
                break;
            case "username":
                list = dormitoryAdminMapper.searchByUsername(value);
                break;
            case "telephone":
                list = dormitoryAdminMapper.searchByTelephone(value);
                break;
        }
        return list;
    }

    @Override
    public void save(DormitoryAdmin dormitoryAdmin) {
        dormitoryAdminMapper.save(dormitoryAdmin);
    }
}

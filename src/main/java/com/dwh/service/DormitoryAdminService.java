package com.dwh.service;


import com.dwh.entity.DormitoryAdmin;

import java.util.List;

public interface DormitoryAdminService {
    /**
     * 查询所有
     * @return
     */
    public List<DormitoryAdmin> list();

    /**
     * 模糊查询
     * @param key   根据什么内容查询
     * @param value 具体查询内容
     * @return
     */
    public List<DormitoryAdmin> search(String key,String value);
    /**
     * 添加
     */
    public void save(DormitoryAdmin dormitoryAdmin);
    /**
     * 删除
     */
    public void delete(Integer id);
    /**
     * 修改
     */
    public void update(DormitoryAdmin dormitoryAdmin);
}

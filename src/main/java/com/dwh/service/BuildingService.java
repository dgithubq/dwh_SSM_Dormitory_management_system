package com.dwh.service;

import com.dwh.entity.Building;

import java.util.List;

public interface BuildingService {
    /**
     * 查询所有楼宇
     * @return
     */
    public List<Building> list();

    /**
     * 根据条件搜索楼宇信息
     * @param key 搜索条件
     * @param value 搜索内容
     * @return
     */
    public List<Building> search(String key,String value);

    /**
     * 添加
     * @param building 楼宇
     */
    public void save(Building building);

    /**
     * 修改
     * @param building
     */
    public void update(Building building);

    /**
     * 删除
     * @param id
     */
    public void delete(Integer id);
}

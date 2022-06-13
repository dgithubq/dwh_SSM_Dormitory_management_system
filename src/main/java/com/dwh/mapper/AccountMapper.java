package com.dwh.mapper;

import com.dwh.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountMapper {
    @Select("select * from sys_user")
    List<Account> queryAll();
}

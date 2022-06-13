package com.dwh.service.impl;

import com.dwh.entity.Account;
import com.dwh.mapper.AccountMapper;
import com.dwh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> findAll() {
        System.out.println("实现业务层");
        return accountMapper.queryAll();
    }
}

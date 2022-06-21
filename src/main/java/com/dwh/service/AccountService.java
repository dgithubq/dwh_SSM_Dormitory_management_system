package com.dwh.service;

import com.dwh.Dto.AccountDto;
import com.dwh.from.AccountForm;

public interface AccountService {
    public AccountDto login(AccountForm accountForm);
}

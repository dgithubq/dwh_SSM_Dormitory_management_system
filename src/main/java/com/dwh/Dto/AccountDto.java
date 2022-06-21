package com.dwh.Dto;

/**
 * 封装AccountService返回的对象
 * @param <T>
 */
public class AccountDto<T> {
    /**
     * -1表示用户名错误
     * -2密码错误
     * 0登陆成功
     */
    private Integer code;
    private T admin;

    public AccountDto(Integer code, T admin) {
        this.code = code;
        this.admin = admin;
    }

    public AccountDto() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getAdmin() {
        return admin;
    }

    public void setAdmin(T admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "code=" + code +
                ", admin=" + admin +
                '}';
    }
}

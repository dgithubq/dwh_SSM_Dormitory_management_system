package com.dwh.from;

/**
 * 封装属性，为了登陆分辨是系统管理还是宿舍管理
 */
public class AccountForm {
    private String username;
    private String password;
    private String type;

    public AccountForm(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public AccountForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccountForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package com.catikco.makepo.admin.user.model;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-27 16:38
 * Description：
 */
public class UserPageModel {
    private Integer id;
    private String account;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
}

package com.hwua.dao;

import com.hwua.entity.User;

public interface UserDao {

    public User selectUserByName(String user_username);

}

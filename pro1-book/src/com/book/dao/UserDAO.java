package com.book.dao;

import com.book.pojo.User;

public interface UserDAO {
    public User getUser(String uname,String pwd);

}

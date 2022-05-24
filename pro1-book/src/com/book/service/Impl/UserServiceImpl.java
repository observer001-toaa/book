package com.book.service.Impl;

import com.book.dao.UserDAO;
import com.book.pojo.User;
import com.book.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    @Override
    public User login(String uname, String pwd) {
        return userDAO.getUser(uname,pwd);
    }
}

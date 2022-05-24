package com.book.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.book.dao.UserDAO;
import com.book.pojo.User;

public class UserDAOImpl extends BaseDAO<User> implements UserDAO {
    @Override
    public User getUser(String uname, String pwd) {
        return load("select * from t_user where uname like ? and pwd like ?",uname,pwd);
    }
}

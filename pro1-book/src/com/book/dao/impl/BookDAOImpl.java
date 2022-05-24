package com.book.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.book.dao.BookDAO;
import com.book.pojo.Book;

import java.util.List;

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    @Override
    public List<Book> getBookList() {
        return executeQuery("select * from t_book where bookStatus=0");
    }
}

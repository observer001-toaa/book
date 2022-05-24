package com.book.dao;

import com.book.pojo.Book;

import java.util.List;

public interface BookDAO {
    //把参数写为Integer minPrice,Integer maxPrice,Integer pageNo 实现查询和分页
    List<Book> getBookList();//获取所有书本信息

}

package com.book.service;

import com.book.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBook(int id);

    //修改书名
    int updateBook(Books books);

    //查询书名
    Books queryBookById(int id);

    //查询全部内容
    List<Books> queryAllBook();

    List<Books> queryBookByName(@Param("bookName")String bookName);

}

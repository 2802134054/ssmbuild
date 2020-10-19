package com.book.dao;

import com.book.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBook(@Param("bookID") int id);

    //修改书名
    int updateBook(Books books);

    //查询书名
    Books queryBookById(@Param("bookID") int id);

    //查询全部内容
    List<Books> queryAllBook();

    //模糊查询
    List<Books> queryBookByName(@Param("bookName")String bookName);
}

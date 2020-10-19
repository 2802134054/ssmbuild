package com.book.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//g/set方法,toString
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
public class Books {
    private int BookID;//id
    private String bookName;//书名
    private int bookCounts;//数量
    private String detail;//描述
}

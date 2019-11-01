package com.xzy.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {
    int add(Book book);

    int del(Book book);

    int delAll(BookVo bookVo);

    int edit(Book book);

    @Transactional(readOnly = true)
    Book load(Book book);

    @Transactional(readOnly = true)
    List<Book> list(BookVo bookVo, PageBean pageBean);

    int editPrice(Book book);
}

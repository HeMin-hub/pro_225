package com.hm.service.impl;

import com.hm.service.IBookService;
import com.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(){

    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getBookId());
    }


    @Override
    public int del(Book book) {
        return bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public int edit(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public List<Book> list(BookVo bookVo, PageBean pageBean) {
        return bookMapper.list(bookVo);
    }

    @Override
    public int editPrice(Book book) {
        Book b=new Book();
        b.setBookId(book.getBookId());
        b.setBookPrice(book.getBookPrice());
        return bookMapper.updateByPrimaryKeySelective(b);
    }

    @Override
    public int delAll(BookVo bookVo) {
        return bookMapper.delAll(bookVo);
    }
}

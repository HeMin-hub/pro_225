package com.hm.mapper;

import com.hm.model.FinWasteBook;

public interface FinWasteBookMapper {
    int deleteByPrimaryKey(Long fwid);

    int insert(FinWasteBook record);

    int insertSelective(FinWasteBook record);

    FinWasteBook selectByPrimaryKey(Long fwid);

    int updateByPrimaryKeySelective(FinWasteBook record);

    int updateByPrimaryKey(FinWasteBook record);
}
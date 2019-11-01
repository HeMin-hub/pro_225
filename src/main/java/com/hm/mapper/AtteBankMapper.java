package com.hm.mapper;

import com.hm.model.AtteBank;

public interface AtteBankMapper {
    int deleteByPrimaryKey(Long abid);

    int insert(AtteBank record);

    int insertSelective(AtteBank record);

    AtteBank selectByPrimaryKey(Long abid);

    int updateByPrimaryKeySelective(AtteBank record);

    int updateByPrimaryKey(AtteBank record);
}
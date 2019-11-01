package com.hm.mapper;

import com.hm.model.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Long uaid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long uaid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}
package com.hm.mapper;

import com.hm.model.FinOverdue;

public interface FinOverdueMapper {
    int deleteByPrimaryKey(Long foid);

    int insert(FinOverdue record);

    int insertSelective(FinOverdue record);

    FinOverdue selectByPrimaryKey(Long foid);

    int updateByPrimaryKeySelective(FinOverdue record);

    int updateByPrimaryKey(FinOverdue record);
}
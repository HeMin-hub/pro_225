package com.hm.mapper;

import com.hm.model.FinAccrual;

public interface FinAccrualMapper {
    int deleteByPrimaryKey(Long faid);

    int insert(FinAccrual record);

    int insertSelective(FinAccrual record);

    FinAccrual selectByPrimaryKey(Long faid);

    int updateByPrimaryKeySelective(FinAccrual record);

    int updateByPrimaryKey(FinAccrual record);
}
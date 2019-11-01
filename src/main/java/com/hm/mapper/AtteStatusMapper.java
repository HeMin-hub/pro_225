package com.hm.mapper;

import com.hm.model.AtteStatus;

public interface AtteStatusMapper {
    int deleteByPrimaryKey(Long asid);

    int insert(AtteStatus record);

    int insertSelective(AtteStatus record);

    AtteStatus selectByPrimaryKey(Long asid);

    int updateByPrimaryKeySelective(AtteStatus record);

    int updateByPrimaryKey(AtteStatus record);
}
package com.hm.mapper;

import com.hm.model.AtteTel;

public interface AtteTelMapper {
    int deleteByPrimaryKey(Long atid);

    int insert(AtteTel record);

    int insertSelective(AtteTel record);

    AtteTel selectByPrimaryKey(Long atid);

    int updateByPrimaryKeySelective(AtteTel record);

    int updateByPrimaryKey(AtteTel record);
}
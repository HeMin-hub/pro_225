package com.hm.mapper;

import com.hm.model.FinStill;

public interface FinStillMapper {
    int deleteByPrimaryKey(Long fsid);

    int insert(FinStill record);

    int insertSelective(FinStill record);

    FinStill selectByPrimaryKey(Long fsid);

    int updateByPrimaryKeySelective(FinStill record);

    int updateByPrimaryKey(FinStill record);
}
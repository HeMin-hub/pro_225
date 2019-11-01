package com.hm.mapper;

import com.hm.model.Materials;

public interface MaterialsMapper {
    int deleteByPrimaryKey(Long amid);

    int insert(Materials record);

    int insertSelective(Materials record);

    Materials selectByPrimaryKey(Long amid);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}
package com.hm.mapper;

import com.hm.model.Relation;

public interface RelationMapper {
    int deleteByPrimaryKey(Long urid);

    int insert(Relation record);

    int insertSelective(Relation record);

    Relation selectByPrimaryKey(Long urid);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}
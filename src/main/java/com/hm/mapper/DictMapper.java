package com.hm.mapper;

import com.hm.model.Dict;

public interface DictMapper {
    int deleteByPrimaryKey(Long did);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}
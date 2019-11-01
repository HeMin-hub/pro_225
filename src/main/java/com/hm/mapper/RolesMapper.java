package com.hm.mapper;

import com.hm.model.Roles;

public interface RolesMapper {
    int deleteByPrimaryKey(Long srid);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Long srid);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}
package com.hm.mapper;

import com.hm.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long ulid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long ulid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
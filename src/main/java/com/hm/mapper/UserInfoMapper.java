package com.hm.mapper;

import com.hm.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long ufid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long ufid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
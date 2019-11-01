package com.hm.mapper;

import com.hm.model.Attestation;

public interface AttestationMapper {
    int deleteByPrimaryKey(Long uatid);

    int insert(Attestation record);

    int insertSelective(Attestation record);

    Attestation selectByPrimaryKey(Long uatid);

    int updateByPrimaryKeySelective(Attestation record);

    int updateByPrimaryKey(Attestation record);
}
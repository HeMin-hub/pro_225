package com.hm.mapper;

import com.hm.model.TreeNode;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Long treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Long treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);
}
package com.slx.zsxt.dao;

import com.slx.zsxt.model.commLogTrans;

public interface commLogTransMapper {
    int deleteByPrimaryKey(String logTransId);

    int insert(commLogTrans record);

    int insertSelective(commLogTrans record);

    commLogTrans selectByPrimaryKey(String logTransId);

    int updateByPrimaryKeySelective(commLogTrans record);

    int updateByPrimaryKey(commLogTrans record);
}
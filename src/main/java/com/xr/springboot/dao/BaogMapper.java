package com.xr.springboot.dao;

import com.xr.springboot.model.Baog;
import org.springframework.stereotype.Repository;

@Repository
public interface BaogMapper {
    int deleteByPrimaryKey(Integer xid);

    int insert(Baog record);

    int insertSelective(Baog record);

    Baog selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(Baog record);

    int updateByPrimaryKey(Baog record);


}
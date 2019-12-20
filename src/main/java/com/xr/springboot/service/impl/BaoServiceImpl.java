package com.xr.springboot.service.impl;

import com.xr.springboot.dao.BaogMapper;
import com.xr.springboot.model.Baog;
import com.xr.springboot.service.BaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaoServiceImpl implements BaoService {

    @Autowired
    private BaogMapper baogMapper;


    @Override
    public Baog selectByPrimaryKey(Integer xid) {
        return baogMapper.selectByPrimaryKey(xid);
    }
}

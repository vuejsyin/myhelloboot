package com.xr.springboot.service;

import com.xr.springboot.model.Baog;

public interface BaoService {

   // public List<User> findUsers();
   public  Baog selectByPrimaryKey(Integer xid);

}

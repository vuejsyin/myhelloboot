package com.xr.springboot.dao;

import com.xr.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findUsers();

}

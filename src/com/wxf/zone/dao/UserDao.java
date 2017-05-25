package com.wxf.zone.dao;

import java.util.List;

import com.wxf.zone.entity.SS;
import com.wxf.zone.entity.User;

public interface UserDao {
	User  findByNumber(String number);
	User findByName(String name);
     void save(User user)  ;
     User findByUserId(String qq_user_id);
    
}

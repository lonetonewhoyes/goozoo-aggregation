package com.goozoo.service;

import com.goozoo.dao.UserDao;
import com.goozoo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User Select(int id){

        return userDao.Select(id);
    }

}

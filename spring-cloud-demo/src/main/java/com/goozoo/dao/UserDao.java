package com.goozoo.dao;

import com.goozoo.entity.User;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserDao {
    User Select(int id);
}

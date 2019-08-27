package com.jhz.dao.user;

import com.jhz.pojo.User;

public interface UserDao {

	User selectByName(String username);
}

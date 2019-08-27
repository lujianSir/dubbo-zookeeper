package com.jhz.serviceimpl;

import com.jhz.dao.user.UserDao;
import com.jhz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
/**
 * @author jhz
 * @date 18-8-5 下午7:27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

	public String loginVerify(String username, String password) {
		// TODO Auto-generated method stub
		 System.out.println("成功进入,后面没有数据库");
		 String str=userDao.selectByName(username).getPwd();
	        if(userDao.selectByName(username) != null && userDao.selectByName(username).getPwd().equals(password)){
	            return "test";
	        }
	        return "fail";
	}
   
}

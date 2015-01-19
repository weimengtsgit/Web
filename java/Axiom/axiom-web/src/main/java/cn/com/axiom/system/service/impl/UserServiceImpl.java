package cn.com.axiom.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.axiom.service.impl.EntityServiceImpl;
import cn.com.axiom.system.dao.UserDao;
import cn.com.axiom.system.entity.User;
import cn.com.axiom.system.service.UserService;

@Service("userService")
public class UserServiceImpl extends EntityServiceImpl<User, Long, UserDao> implements UserService{
	

	

	@Override
	public User findUserByUserName(String username) {
		
		return  entityDao.findUserByUserName(username);
	}

	@Override
	public void save(User user) {
		entityDao.save(user);
	}


	@Override
	@Autowired
	public void setEntityDao(UserDao entityDao) {
		this.entityDao = entityDao;
	}


}

package com.sample.business.service;
import com.sample.business.model.User;
import com.sample.dao.UserDao;

import lombok.Data;

@Data
//本当はインターフェースからimplemetsすべきですが、ここでは簡略のためそのままクラスを作っています。
public class UserService {
	private UserDao userDao;

	public User getUser(String id){
		return this.userDao.getUser(id);
	}

	public void updateUser(User user){
		this.userDao.updateUser(user);
	}
}
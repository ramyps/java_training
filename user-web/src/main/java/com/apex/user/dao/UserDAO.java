package com.apex.user.dao;

import com.apex.user.vo.User;

public interface UserDAO {
	public User getUser(int id);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);


}

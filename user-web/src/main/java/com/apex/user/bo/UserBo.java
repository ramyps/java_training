package com.apex.user.bo;

import com.apex.user.vo.User;

public interface UserBo {
//crud
	public User getUser(int id);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);

}

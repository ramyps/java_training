package com.vs.hr.dao;

import com.vs.hr.vo.UserVO;

public interface UsrDAO {

	public abstract UserVO getUsr(int usrID) throws Exception;

	public abstract void addUsr(UserVO usrVO) throws Exception;

}
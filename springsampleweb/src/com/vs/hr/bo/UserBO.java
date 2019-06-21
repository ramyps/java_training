package com.vs.hr.bo;

import com.vs.hr.vo.UserVO;

public interface UserBO {
	public abstract UserVO getUsr(int usrID) throws Exception;
	public abstract void addUsr(UserVO usrVO) throws Exception;
}

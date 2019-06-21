package com.vs.hr.bo;

import com.vs.hr.dao.UsrDAO;
import com.vs.hr.vo.UserVO;

public class UserBOImpl implements UserBO {
	private UsrDAO usrDAO = null;
	
	@Override
	public UserVO getUsr(int usrID) throws Exception {
		//2a: validation
		//2b: db interaction
		UserVO userVO = usrDAO.getUsr(usrID);
		return userVO;
	}

	@Override
	public void addUsr(UserVO usrVO) throws Exception {
		System.out.println("Entry:  UserBOImpl:addUsr()");
		//2a: validation
		//2b: db interaction
		usrDAO.addUsr(usrVO);
		System.out.println("Exit:  UserBOImpl:addUsr()");
		return;		
	}

	public UsrDAO getUsrDAO() {
		return usrDAO;
	}

	public void setUsrDAO(UsrDAO usrDAO) {
		this.usrDAO = usrDAO;
	}
}
	package com.vs.hr.contrl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vs.hr.bo.UserBO;
import com.vs.hr.vo.UserVO;


public class AddUserController extends SimpleFormController{
	UserBO userBO = null;
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		//step1
		System.out.println("AddUserController logic -  strating");
		UserVO usrVO = (UserVO) command;
		System.out.println(usrVO.getFirstName());
		
		//step2
		//call the business object
		userBO.addUsr(usrVO);
		
		ModelAndView mv = new ModelAndView("success", "usr", usrVO);
		System.out.println("AddUserController logic -  end");
		//step3
		return mv;
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {
		UserVO userVO = new UserVO();
		return userVO;
	}

	public UserBO getUserBO() {
		return userBO;
	}

	public void setUserBO(UserBO userBO) {
		this.userBO = userBO;
	}
}

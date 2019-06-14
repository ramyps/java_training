package com.javatraining.apex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javatraining.apex.bean.BankInfoBean;
import com.javatraining.apex.validation.ValidateFields;

/**
 * Servlet implementation class BankInfoServlet
 */
@WebServlet("/bank")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BankInfoBean personalInfo = new BankInfoBean();
		ValidateFields validateFields = new ValidateFields();
		String errors="";
		
		String bank = request.getParameter("bank");
		String accountno = request.getParameter("accountno");
		String ssn = request.getParameter("ssn");
		personalInfo.setAccountno(accountno);
		personalInfo.setBank(bank);
		personalInfo.setSsn(ssn);
//		request.getSession().setAttribute("bank", bank);
//		request.getSession().setAttribute("accountno", accountno);
//		request.getSession().setAttribute("ssn", ssn);
		System.out.println("Bank  details set " + bank);
		HttpSession ses = request.getSession();
		
		if(validateFields.isOptionBlank(bank)) {
			errors+="Bank Name must be selected";
		}
		if((validateFields.isBlank(accountno))||(validateFields.isNumber(accountno))) {
			errors+="<br>Account No cannot be blank and min length  of 7 numbers is required";
		}if((validateFields.isBlank(ssn))||(validateFields.isNumber(ssn))) {
			errors+="<br>SSN No cannot be blank and min length  of 7 numbers is required";
		}
		
//		System.out.println(validateFields.isBlank(errors));
		if(validateFields.isBlank(errors)) {
			ses.setAttribute("pinform3", personalInfo);
			response.sendRedirect("/BankWebApp/jsp/successPage.jsp");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebApp/jsp/Bank.jsp");	

		}
		
	}
}

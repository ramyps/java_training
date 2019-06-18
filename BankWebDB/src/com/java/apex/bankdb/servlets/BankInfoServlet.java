package com.java.apex.bankdb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.PersonalAccount;
import com.java.apex.bankdb.validation.ValidateFields;

/**
 * Servlet implementation class BankInfoServlet
 */
@WebServlet("/bankInfo")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonalAccount personalInfo = new PersonalAccount();
		ValidateFields validateFields = new ValidateFields();
		String errors="";
		
		String bank = request.getParameter("bank");
		String accountNo = request.getParameter("accountNo");
		String SSN = request.getParameter("SSN");
		personalInfo.setAccountNo(accountNo);
		personalInfo.setBank(bank);
		personalInfo.setSSN(SSN);
//		request.getSession().setAttribute("bank", bank);
//		request.getSession().setAttribute("accountno", accountno);
//		request.getSession().setAttribute("ssn", ssn);
		System.out.println("Bank  details set " + bank);
		HttpSession ses = request.getSession();
		
//		if(validateFields.isOptionBlank(bank)) {
////			errors+="Bank Name must be selected";
//		}
//		if((validateFields.isBlank(accountNo))||(validateFields.isNumber(accountNo))) {
////			errors+="<br>Account No cannot be blank and min length  of 7 numbers is required";
//		}if((validateFields.isBlank(SSN))||(validateFields.isNumber(SSN))) {
////			errors+="<br>SSN No cannot be blank and min length  of 7 numbers is required";
//		}
//		
////		System.out.println(validateFields.isBlank(errors));
		if(validateFields.isBlank(errors)) {
			ses.setAttribute("bankInfoSession", personalInfo);
			response.sendRedirect("/BankWebApp/jsp/Success.jsp");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebApp/jsp/Bank.jsp");	

		}
		
	}
}

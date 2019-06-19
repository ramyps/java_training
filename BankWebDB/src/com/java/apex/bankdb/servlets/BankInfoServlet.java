package com.java.apex.bankdb.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.BankAccount;
import com.java.apex.bankdb.beans.ContactAccount;
import com.java.apex.bankdb.beans.PersonalAccount;
import com.java.apex.bankdb.dbaccess.ConnectionUtils;
import com.java.apex.bankdb.utils.DBUtils;
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
		
		BankAccount bankInfo = new BankAccount();
		ValidateFields validateFields = new ValidateFields();
		String errors="";
		
		/*
		 * String bank = request.getParameter("bank"); String accountNo =
		 * request.getParameter("accountNo"); String SSN = request.getParameter("SSN");
		 */
		bankInfo.setAccountNo(request.getParameter("accountNo"));
		bankInfo.setBank(request.getParameter("bank"));
		bankInfo.setSSN(request.getParameter("SSN"));
	
		request.getSession().setAttribute("bank", request.getParameter("bank"));
		request.getSession().setAttribute("accountNo", request.getParameter("accountNo"));
		request.getSession().setAttribute("SSN", request.getParameter("SSN"));
		System.out.println("Bank  details set " +bankInfo.getSSN());
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
			ses.setAttribute("bankInfoSession", bankInfo);
			try {
				PersonalAccount personalInfo = (PersonalAccount) ses.getAttribute("personInfoSession");
				personalInfo.setFirstName( (String) request.getSession().getAttribute("firstName"));
				personalInfo.setLastName((String) request.getSession().getAttribute("lastName"));
				personalInfo.setMiddleName((String) request.getSession().getAttribute("middleName"));
				personalInfo.setGender((String) request.getSession().getAttribute("gender"));
				ContactAccount contactInfo = (ContactAccount) ses.getAttribute("contactInfoSession");

				contactInfo.setAddress((String) request.getSession().getAttribute("address"));
				contactInfo.setCity( (String) request.getSession().getAttribute("city"));
				contactInfo.setState((String) request.getSession().getAttribute("state"));
				contactInfo.setCountry((String) request.getSession().getAttribute("country"));
				contactInfo.setMobileNo((String) request.getSession().getAttribute("mobileNo"));
//				PersonalAccount bankInfo1 = (PersonalAccount) ses.getAttribute("bankInfoSession");
				bankInfo.setAccountNo((String) request.getSession().getAttribute("accountNo"));
				bankInfo.setBank((String) request.getSession().getAttribute("bank"));
				bankInfo.setSSN((String) request.getSession().getAttribute("SSN"));
				
				System.out.println("Connecting to database...\n BANK NAME "+bankInfo.getSSN());
				DBUtils.insertPerson(ConnectionUtils.getConnection(),personalInfo,contactInfo, bankInfo);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.sendRedirect("/BankWebDB/jsp/Success.jsp");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebDB/jsp/Bank.jsp");	

		}
		
	}
}

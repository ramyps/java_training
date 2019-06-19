/**
 * 
 */
package com.java.apex.bankdb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.PersonalAccount;
import com.java.apex.bankdb.dbaccess.ConnectionUtils;
import com.java.apex.bankdb.utils.DBUtils;

/**
 * @author Ramy
 *
 */
@WebServlet("/updateDetailsInfo")

public class UpdateDetailsServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonalAccount personalInfo = new PersonalAccount();
		personalInfo.setFirstName(request.getParameter("firstName"));
		personalInfo.setLastName(request.getParameter("lastName"));
		personalInfo.setMiddleName(request.getParameter("middleName"));
		personalInfo.setGender(request.getParameter("gender"));
		personalInfo.setAddress(request.getParameter("address"));
		personalInfo.setCity(request.getParameter("city"));
		personalInfo.setState(request.getParameter("state"));
		personalInfo.setCountry(request.getParameter("country"));
		personalInfo.setMobileNo(request.getParameter("mobileNo"));
		personalInfo.setAccountNo(request.getParameter("accountNo"));
		personalInfo.setBank(request.getParameter("bank"));
		personalInfo.setSSN(request.getParameter("SSN"));
		
		try {
			
			System.out.println("Connecting to database...\n SSN "+personalInfo.getSSN());
			DBUtils.updatePerson(ConnectionUtils.getConnection(),personalInfo);
		}catch(Exception e) {
			e.printStackTrace();

		}		
		HttpSession ses = request.getSession();

		ses.setAttribute("bankInfoSession", personalInfo);

		response.sendRedirect("/BankWebDB/jsp/UpdateSuccess.jsp");

		}
		

}

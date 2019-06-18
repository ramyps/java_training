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
 * Servlet implementation class PersonalInfoServlet
 */
@WebServlet("/personInfo")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonalAccount personalInfo = new PersonalAccount();
		ValidateFields validateFields = new ValidateFields();
		String errors="";

		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		personalInfo.setFirstName(firstName);
		personalInfo.setLastName(lastName);
		personalInfo.setMiddleName(middleName);
		personalInfo.setGender(gender);

		System.out.println("Personal  details set " + firstName + " "+gender);


//
//		if(validateFields.isBlank(firstName)) {
////			System.out.println(firstname);
//			errors+="First Name cannot be blank and min length 2 characters is required";
//		}
//		if(validateFields.isBlank(middleName)) {
////			System.out.println(middlename);
//
//			errors+="<br>Middle Name cannot be blank and min length 2 characters is required";
//		}if(validateFields.isBlank(lastName)) {
////			System.out.println(lastname);
//			errors+="<br>Last Name cannot be blank and min length 2 characters is required";
//		}if(validateFields.isOptionBlank(gender)) {
////			System.out.println(gender);
//			errors+="<br>Gender must be selected ";
//		}
		
		HttpSession ses = request.getSession();
		response.setContentType("text/html");
//		System.out.println(validateFields.isBlank(errors));
		if(validateFields.isBlank(errors)) {
			ses.setAttribute("personInfoSession", personalInfo);
			response.sendRedirect("/BankWebApp/html/Contact.html");
		}else {
//			ses.setAttribute("pinform1", personalInfo);
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebApp/jsp/Personal.jsp");
		}
	

	}

}

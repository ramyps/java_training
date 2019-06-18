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
 * Servlet implementation class ContactInfoServlet
 */
@WebServlet("/contactInfo")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonalAccount personalInfo = new PersonalAccount();
		ValidateFields validateFields = new ValidateFields();
		String errors="";

		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String mobileNo = request.getParameter("mobileNo");

		personalInfo.setAddress(address);
		personalInfo.setCity(city);
		personalInfo.setState(state);
		personalInfo.setCountry(country);
		personalInfo.setMobileNo(mobileNo);

		//		request.getSession().setAttribute("address", address);
		//		request.getSession().setAttribute("city", city);
		//		request.getSession().setAttribute("state", state);
		//		request.getSession().setAttribute("country", country);
		//		request.getSession().setAttribute("phoneno", phoneno);
		response.setContentType("text/html");
		System.out.println("Contact  details set" + city);

		HttpSession ses = request.getSession();

//		if(validateFields.isBlank(address)) {
//			errors+="First Name cannot be blank and min length 2 characters is required";
//		}
//		if(validateFields.isBlank(city)) {
//			errors+="<br>Middle Name cannot be blank and min length 2 characters is required";
//		}if(validateFields.isBlank(state)) {
//			errors+="<br>Last Name cannot be blank and min length 2 characters is required";
//		}if(validateFields.isOptionBlank(country)) {
//			errors+="<br>Country must be selected ";
//		}if(validateFields.isBlank(mobileNo) ||(validateFields.isNumber(mobileNo)) ) {
//			errors+="<br>Phone No cannot be blank and min length  of 7 numbers is required";
//		}

		//		System.out.println(validateFields.isBlank(errors));
		if(validateFields.isBlank(errors)) {
			ses.setAttribute("contactInfoSession", personalInfo);
			response.sendRedirect("/BankWebApp/html/Bank.html");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebApp/jsp/Contact.jsp");

		}


	}

}

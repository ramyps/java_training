package com.java.apex.bankdb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.ContactAccount;
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
		ContactAccount contactInfo = new ContactAccount();
		ValidateFields validateFields = new ValidateFields();
		String errors="";

//		String address = request.getParameter("address");
//		String city = request.getParameter("city");
//		String state = request.getParameter("state");
//		String country = request.getParameter("country");
//		String mobileNo = request.getParameter("mobileNo");

		contactInfo.setAddress(request.getParameter("address"));
		contactInfo.setCity(request.getParameter("city"));
		contactInfo.setState(request.getParameter("state"));
		contactInfo.setCountry(request.getParameter("country"));
		contactInfo.setMobileNo(request.getParameter("mobileNo"));

		request.getSession().setAttribute("address", request.getParameter("address"));
		request.getSession().setAttribute("city", request.getParameter("city"));
		request.getSession().setAttribute("state", request.getParameter("state"));
		request.getSession().setAttribute("country", request.getParameter("country"));
		request.getSession().setAttribute("mobileNo", request.getParameter("mobileNo"));
////		response.setContentType("text/html");
		System.out.println("Contact  details set" + request.getParameter("country"));

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
			ses.setAttribute("contactInfoSession", contactInfo);
			response.sendRedirect("/BankWebDB/jsp/Bank.jsp");	
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebDB/jsp/Contact.jsp");

		}


	}

}

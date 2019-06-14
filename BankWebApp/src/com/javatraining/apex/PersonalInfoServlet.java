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
 * Servlet implementation class PersonalInfoServlet
 */
@WebServlet("/pInfo")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankInfoBean personalInfo = new BankInfoBean();
		ValidateFields validateFields = new ValidateFields();
		String errors="";

		String firstname = request.getParameter("firstname");
		String middlename = request.getParameter("middlename");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		personalInfo.setFirstname(firstname);
		personalInfo.setLastname(lastname);
		personalInfo.setMiddlename(middlename);
		personalInfo.setGender(gender);
//		request.getSession().setAttribute("firstname", firstname);
//		request.getSession().setAttribute("middlename", middlename);
//		request.getSession().setAttribute("lastname", lastname);
//		request.getSession().setAttribute("gender", gender);
		System.out.println("Personal  details set " + firstname + " "+gender);



		if(validateFields.isBlank(firstname)) {
//			System.out.println(firstname);
			errors+="First Name cannot be blank and min length 2 characters is required";
		}
		if(validateFields.isBlank(middlename)) {
//			System.out.println(middlename);

			errors+="<br>Middle Name cannot be blank and min length 2 characters is required";
		}if(validateFields.isBlank(lastname)) {
//			System.out.println(lastname);
			errors+="<br>Last Name cannot be blank and min length 2 characters is required";
		}if(validateFields.isOptionBlank(gender)) {
//			System.out.println(gender);
			errors+="<br>Gender must be selected ";
		}
		HttpSession ses = request.getSession();
		response.setContentType("text/html");
//		System.out.println(validateFields.isBlank(errors));
		if(validateFields.isBlank(errors)) {
			ses.setAttribute("pinform1", personalInfo);
			response.sendRedirect("html/Contact.html");
		}else {
//			ses.setAttribute("pinform1", personalInfo);
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebApp/jsp/Personal.jsp");
		}
	

	}

}

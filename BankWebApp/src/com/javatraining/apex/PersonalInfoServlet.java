package com.javatraining.apex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javatraining.apex.bean.BankInfoBean;

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

		String firstname = request.getParameter("firstname");
    	String middlename = request.getParameter("middlename");
    	String lastname = request.getParameter("lastname");
    	String gender = request.getParameter("gender");

    	request.getSession().setAttribute("firstname", firstname);
    	request.getSession().setAttribute("middlename", middlename);
    	request.getSession().setAttribute("lastname", lastname);
    	request.getSession().setAttribute("gender", gender);
		System.out.println("Personal  details set " + firstname);

        HttpSession ses = request.getSession();
		ses.setAttribute("pinform1", personalInfo);
		
        response.setContentType("text/html");

		response.sendRedirect("/BankWebApp/html/Contact.html");
	
	}

}

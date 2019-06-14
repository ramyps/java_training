package com.javatraining.apex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
    	String middlename = request.getParameter("middlename");
    	String lastname = request.getParameter("lastname");
    	String gender = request.getParameter("gender");
    	String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phoneno = request.getParameter("phoneno");
		String bank = request.getParameter("bank");
    	String accountno = request.getParameter("accountno");
    	String ssn = request.getParameter("ssn");
	
    	PrintWriter out = response.getWriter();
    	out.print("Details Entered by you");
    	out.print("First Name " +firstname);	
    	out.print("Middle Name " +middlename);
    	out.print("Last Name " +lastname);
    	out.print("Gender " +gender);
    	out.print("Address " +address);
    	out.print("City " +city);
    	out.print("State " +state);
    	out.print("Country " +country);
    	out.print("Phone No " +phoneno);
    	out.print("Bank " +bank);
    	out.print("Account No " +accountno);
    	out.print("SSN " +ssn);	
	}

}

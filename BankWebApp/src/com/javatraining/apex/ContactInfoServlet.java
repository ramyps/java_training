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
 * Servlet implementation class ContactInfoServlet
 */
@WebServlet("/contact")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankInfoBean personalInfo = new BankInfoBean();

		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phoneno = request.getParameter("phoneno");


		request.getSession().setAttribute("address", address);
		request.getSession().setAttribute("city", city);
		request.getSession().setAttribute("state", state);
		request.getSession().setAttribute("country", country);

		request.getSession().setAttribute("phoneno", phoneno);
		response.setContentType("text/html");
		System.out.println("Contact  details set" + city);

		HttpSession ses = request.getSession();
		ses.setAttribute("pinform2", personalInfo);
		response.sendRedirect("/BankWebApp/html/Bank.html");

	}

}

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
 * Servlet implementation class BankInfoServlet
 */
@WebServlet("/binfo")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BankInfoBean personalInfo = new BankInfoBean();
		String bank = request.getParameter("bank");
		String accountno = request.getParameter("accountno");
		String ssn = request.getParameter("ssn");
		request.getSession().setAttribute("bank", bank);
		request.getSession().setAttribute("accountno", accountno);
		request.getSession().setAttribute("ssn", ssn);
		System.out.println("Bank  details set" + bank);
//		 response.setContentType("text/html");
		HttpSession ses = request.getSession();
		ses.setAttribute("pinform3", personalInfo);
		response.sendRedirect("/BankWebApp/WebContent/jsp/successPage.jsp");	
		
	}
}

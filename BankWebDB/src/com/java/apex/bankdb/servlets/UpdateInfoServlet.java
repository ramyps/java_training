package com.java.apex.bankdb.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.BankAccount;
import com.java.apex.bankdb.beans.PersonalAccount;
import com.java.apex.bankdb.dbaccess.ConnectionUtils;
import com.java.apex.bankdb.utils.DBUtils;
import com.java.apex.bankdb.validation.ValidateFields;

@WebServlet("/updateInfo")

public class UpdateInfoServlet  extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession ses = request.getSession();
		ValidateFields validateFields = new ValidateFields();
		PersonalAccount personList = new PersonalAccount();
		BankAccount bankInfo = new BankAccount();

		String errors = "";
		String SSN = request.getParameter("SSN");
		System.out.println(SSN);
		bankInfo.setSSN(SSN);
		if(validateFields.isBlank(errors)) {
			try {				
				System.out.println("Connecting to database...\n BANK NAME "+bankInfo.getSSN());
				personList = DBUtils.findPerson(ConnectionUtils.getConnection(),SSN);
//				ses.setAttribute("viewInfoSession", person);

			}
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("personInfoSession", personList);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/UpdateInfo.jsp");
			rd.forward(request, response);
			
			
//			ses.setAttribute("personInfoSession", personList);

//			ses.setAttribute("personInfoSession", personList.get(1));
//			ses.setAttribute("personInfoSession", personList.get(2));
//			response.sendRedirect("/BankWebDB/jsp/UpdateInfo.jsp");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebDB/jsp/Update.jsp");	
		}

	}
}

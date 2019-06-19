package com.java.apex.bankdb.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.PersonalAccount;
import com.java.apex.bankdb.dbaccess.ConnectionUtils;
import com.java.apex.bankdb.utils.DBUtils;
@WebServlet("/deleteInfo")

public class DeleteInfoServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PersonalAccount personList = new PersonalAccount();
		String SSN = request.getParameter("SSN");
		System.out.println(SSN);
		personList.setSSN(SSN);
		try {				
			System.out.println("Connecting to database...\n SSN "+personList.getSSN());
			DBUtils.deletePerson(ConnectionUtils.getConnection(),SSN);
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		HttpSession ses = request.getSession();
		ses.setAttribute("personInfoSession", personList);
		response.sendRedirect("/BankWebDB/jsp/DeleteSuccess.jsp");

	}

}



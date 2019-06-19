/**
 * 
 */
package com.java.apex.bankdb.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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

/**
 * @author Ramy
 *
 */
@WebServlet("/viewInfo")

public class ViewInfoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession ses = request.getSession();
		ValidateFields validateFields = new ValidateFields();
		PersonalAccount personList = new PersonalAccount();

		String errors = "";
	
		String SSN = request.getParameter("SSN");
		System.out.println(SSN);
		personList.setSSN(SSN);
		if(validateFields.isBlank(errors)) {
			try {				
				System.out.println("Connecting to database...\n SSN "+personList.getSSN());
				personList = DBUtils.findPerson(ConnectionUtils.getConnection(),SSN);
//				ses.setAttribute("viewInfoSession", person);

			}
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			ses.setAttribute("personInfoSession", personList);
//			ses.setAttribute("contactInfoSession", personList.get(1));
//			ses.setAttribute("bankInfoSession", personList.get(2));

			response.sendRedirect("/BankWebDB/jsp/ViewInfo.jsp");
		}else {
			request.setAttribute("errMsg", errors);
			response.sendRedirect("/BankWebDB/jsp/View.jsp");	
		}

	}
}

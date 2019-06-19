/**
 * 
 */
package com.java.apex.bankdb.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/viewAllInfo")

public class ViewAllInfoServlet extends HttpServlet {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String errors = "";
	        response.setContentType("text/html");
	        
			PersonalAccount person[] = null;
	
				try {				
					System.out.println("Connecting to database...\n ");
					ArrayList personList = DBUtils.allPersons(ConnectionUtils.getConnection());
					Object[] aList = personList.toArray(new PersonalAccount[personList.size()]);
					person = new PersonalAccount[personList.size()];
					for(int i =0;i<aList.length;i++) {
						person[i] = (PersonalAccount) aList[i];
						System.out.println(person[i].getFirstName());
					}


				}
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				request.getSession().setAttribute("allPerson", person);	
				response.sendRedirect("/BankWebDB/jsp/ViewAllInfo.jsp");	

		}

}

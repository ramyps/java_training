/**
 * 
 */
package com.java.apex.bankdb.utils;

/**
 * @author Ramy
 *
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.apex.bankdb.beans.PersonalAccount;;


public class DBUtils {

	//insert person details into mysql test.bankdb
	public static void insertPerson(Connection conn, PersonalAccount person) throws SQLException {
		String sql = "Insert into bankdb(`firstname`, `middlename`, `lastname`, `gender`, `address`, `city`, `state`, `country`, `mobileno`, `bank`, `accountno`, `ssn`) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, person.getFirstName());
		pstm.setString(2, person.getMiddleName());
		pstm.setString(3, person.getLastName());
		pstm.setString(4, person.getGender());
		pstm.setString(5, person.getAddress());
		pstm.setString(6, person.getCity());
		pstm.setString(7, person.getState());
		pstm.setString(8, person.getCountry());
		pstm.setString(9, person.getMobileNo());
		pstm.setString(10, person.getBank());
		pstm.setString(11, person.getAccountNo());
		pstm.setString(12, person.getSSN());

		pstm.executeUpdate();
	}

	//select person details from mysql test.bankdb with given SSN

	public static PersonalAccount viewPerson(Connection conn, String SSN) throws SQLException {

		String sql = "Select a.firstname, a.middlename, a.lastname from bankdb a "//
				+ " where a.SSN = ? ";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, SSN);

		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			String firstName = rs.getString("firstname");
			String middleName = rs.getString("middlename");
			String lastName = rs.getString("lastname");

			PersonalAccount person = new PersonalAccount();
			person.setFirstName(firstName);
			person.setMiddleName(middleName);
			person.setLastName(lastName);
			return person;
		}
		return null;
	}

	//select ALL person details from mysql test.bankdb

	public static List<PersonalAccount> allPersons(Connection conn) throws SQLException {
		String sql = "Select a.firstname, a.middlename, a.lastname from bankdb a ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<PersonalAccount> list = new ArrayList<PersonalAccount>();
		while (rs.next()) {
			String firstName = rs.getString("firstname");
			String middleName = rs.getString("middlename");
			String lastName = rs.getString("lastname");
			PersonalAccount person = new PersonalAccount();
			person.setFirstName(firstName);
			person.setMiddleName(middleName);
			person.setLastName(lastName);
			list.add(person);
		}
		return list;
	}


	//Update person details from mysql test.bankdb with given SSN

	public static void updatePerson(Connection conn, PersonalAccount person) throws SQLException {
		String sql = "Update bankdb set firstname =?, middlename=? where SSN=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, person.getFirstName());
		pstm.setString(2, person.getMiddleName());
		pstm.setString(3, person.getSSN());
		pstm.executeUpdate();
	}


	//delete person details from mysql test.bankdb with given SSN

	public static void deletePerson(Connection conn, String SSN) throws SQLException {
		String sql = "Delete From bankdb where ssn= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, SSN);

		pstm.executeUpdate();
	}

}
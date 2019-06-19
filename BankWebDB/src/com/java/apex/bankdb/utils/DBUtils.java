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

import com.java.apex.bankdb.beans.BankAccount;
import com.java.apex.bankdb.beans.ContactAccount;
import com.java.apex.bankdb.beans.PersonalAccount;;


public class DBUtils {

	//insert person details into mysql test.bankdb
	public static void insertPerson(Connection conn, PersonalAccount person, ContactAccount contact, BankAccount bank) throws SQLException {
		String sql = "Insert into bankdb(`firstname`, `middlename`, `lastname`, `gender`, `address`, `city`, `state`, `country`, `mobileno`, `bank`, `accountno`, `ssn`) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, person.getFirstName());
		pstm.setString(2, person.getMiddleName());
		pstm.setString(3, person.getLastName());
		pstm.setString(4, person.getGender());
		pstm.setString(5, contact.getAddress());
		pstm.setString(6, contact.getCity());
		pstm.setString(7, contact.getState());
		pstm.setString(8, contact.getCountry());
		pstm.setString(9, contact.getMobileNo());
		pstm.setString(10, bank.getBank());
		pstm.setString(11, bank.getAccountNo());
		pstm.setString(12, bank.getSSN());

		int rows = pstm.executeUpdate();
		System.out.println(rows+ " row updated");
		pstm.close();
	}

	//select person details from mysql test.bankdb with given SSN

	public static PersonalAccount findPerson(Connection conn, String SSN) throws SQLException {

		PersonalAccount person = new PersonalAccount(); 
		String sql = "Select `firstname`, `middlename`, `lastname`, `gender`, `address`, `city`, `state`, `country`, `mobileno`, `bank`, `accountno`, `ssn`  from bankdb "
				+ " where SSN = ? ";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, SSN);

		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			String firstName = rs.getString("firstname");
			String middleName = rs.getString("middlename");
			String lastName = rs.getString("lastname");
			String gender = rs.getString("gender");

			System.out.println(firstName+" "+middleName+" "+lastName);
			//			PersonalAccount person = new PersonalAccount();
			person.setFirstName(firstName);
			person.setMiddleName(middleName);
			person.setLastName(lastName);
			person.setGender(gender);

			//			ContactAccount contact = new ContactAccount();
			person.setAddress(rs.getString("address"));
			person.setCity(rs.getString("city"));
			person.setCountry(rs.getString("country"));
			person.setMobileNo(rs.getString("mobileno"));
			person.setState(rs.getString("state"));

			//			BankAccount bank = new BankAccount();
			person.setAccountNo(rs.getString("accountno"));
			person.setBank(rs.getString("bank"));
			person.setSSN(rs.getString("SSN"));

			//			personList.add(person);
			//			personList.add(contact);
			//			personList.add(bank);

			return person;
		}else {
			System.out.println("RS didn't retrieve data");
		}
		return null;
	}

	//select ALL person details from mysql test.bankdb

	public static ArrayList allPersons(Connection conn) throws SQLException {
		String sql = "Select a.firstname, a.middlename, a.lastname from bankdb a ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		ArrayList list = new ArrayList();
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
		String sql = "Update `bankdb` set firstname=?, middlename=?, lastname=?, gender=?, address=?, city=?, state=?, country=?, mobileno=?, bank=?, accountno=? where SSN=? ";
//		String sql = "Update `bankdb` set firstname=?, middlename=?, lastname=?, gender=?, address=?, city=?, state=?, country=?, mobileno=?, bank=?, accountno=?, where SSN=? ";

		try {
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
			int rows = pstm.executeUpdate();
			System.out.println(rows+" updated");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}


	//delete person details from mysql test.bankdb with given SSN

	public static void deletePerson(Connection conn, String SSN) throws SQLException {
		String sql = "Delete From `bankdb` where ssn= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, SSN);

		int rows = pstm.executeUpdate();
		System.out.println(rows+" deleted");
	}

}
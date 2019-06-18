/**
 * 
 */
package com.java.apex.bankdb.validation;

import java.lang.*;
/**
 * @author Ramy
 *
 */
public class ValidateFields {

	/**
	 * 
	 */
	String fieldName;
	boolean errors = false;
	String error = "";
	String method = "";
	public ValidateFields() {
		super();
	}

	public boolean isBlank(String fieldName) throws NullPointerException{
		String method = "isBlank";
		try {
			if((fieldName == null)||((fieldName.trim().length()) <= 0)) {
				{
					errors = true;
				}
			}
		}catch (Exception e) {
//			System.out.println("in is Blank"+ fieldName);
			System.out.println("<br>"+fieldName+" cannot be left blank");
//			error += fieldName+" cannot be left blank" ;
		}
		return (errors);
	}
	public boolean isOptionBlank(String fieldName) throws NullPointerException{
		System.out.println("in Option Blank"+ fieldName);
		String method = "isOptionBlank";

		
		return ((fieldName.equals(null))||(fieldName.equals("")));
	}
	public boolean isNumber(String fieldName){
		String method = "isNumber";

		System.out.println("in is isNumber"+ fieldName);

		return ((fieldName.matches("[0-9$]+")) && (fieldName.length() >= 9));
	}
	public boolean isChar(String fieldName){
		String method = "isChar";

//		System.out.println("in is isNumber"+ fieldName);

		return ((fieldName.matches("[a-zA-Z0-9$]+")) && (fieldName.length() >= 2));
	}
	/*
	 * public String hasError(String fieldName, String method) { String errMsg = "";
	 * if(method.equalsIgnoreCase("isBlank")) { errMsg = fieldName.toUpperCase()
	 * +" cannot be blank and min length 2 characters is required"; }else
	 * if(method.equalsIgnoreCase("isNumber")) { errMsg = fieldName.toUpperCase()
	 * +" cannot be blank and min length  of 9 numbers is required"; }else
	 * if(method.equalsIgnoreCase("isOptionBlank")){ errMsg =
	 * fieldName.toUpperCase() +"  must be selected"; } return errMsg;
	 * 
	 * }||((fieldName.contains("[a-zA-Z]+")) == true)
	 */



}

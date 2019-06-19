/**
 * 
 */
package com.java.apex.bankdb.utils;

/**
 * @author Ramy
 *
 */

import java.sql.Connection;
 
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.apex.bankdb.beans.PersonalAccount;;
 
public class MyUtils {
 
    public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
 
	private static final String ATT_NAME_FIRST_NAME = "ATTRIBUTE_FOR_STORE_FIRST_NAME_IN_COOKIE";
 
    // Store Connection in request attribute.
    // (Information stored only exist during requests)
    public static void storeConnection(ServletRequest request, Connection conn) {
        request.setAttribute(ATT_NAME_CONNECTION, conn);
    }
 
    // Get the Connection object has been stored in attribute of the request.
    public static Connection getStoredConnection(ServletRequest request) {
        Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
        return conn;
    }
 
    // Store user info in Session.
    public static void storePersonFirstName(HttpSession session, PersonalAccount person) {
        // On the JSP can access via ${loginedUser}
        session.setAttribute("personInfo", person);
    }
 
    // Get the user information stored in the session.
    public static PersonalAccount getPersonFirstName(HttpSession session) {
    	PersonalAccount personSession = (PersonalAccount) session.getAttribute("personInfo");
        return personSession;
    }
 
    // Store info in Cookie
    public static void storePersonCookie(HttpServletResponse response, PersonalAccount person) {
        System.out.println("Store user cookie");
        Cookie cookieFirstName = new Cookie(ATT_NAME_FIRST_NAME, person.getFirstName());
        // 1 day (Converted to seconds)
        cookieFirstName.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieFirstName);
    }
 
    public static String getPersonNameInCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (ATT_NAME_FIRST_NAME.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
 
    // Delete cookie.
    public static void deletePersonCookie(HttpServletResponse response) {
        Cookie cookieUserName = new Cookie(ATT_NAME_FIRST_NAME, null);
        // 0 seconds (This cookie will expire immediately)
        cookieUserName.setMaxAge(0);
        response.addCookie(cookieUserName);
    }
 
}
package com.learners.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String adminPassword;
	private String adminUserName;


    public AdminLoginServlet() {
        // TODO Auto-generated constructor stub
    	
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			String command = request.getParameter("command");
//			if(command == null) {
//				command = "CLASSLIST";
//			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Dashboard.jsp");
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Post method");
		adminUserName = request.getServletContext().getInitParameter("adminUserName");
		adminPassword = request.getServletContext().getInitParameter("adminPassword");
		String userName = request.getParameter("email");
		String password = request.getParameter("password");
		if(adminUserName.equals(userName) && adminPassword.equals(password)) {
			System.out.println("Authorization is completed");
			Cookie cookie = new Cookie(userName, password);
			cookie.setMaxAge(86400); 
			response.addCookie(cookie);
			doGet(request, response);
		}
		else {
		
			response.sendRedirect("/LearnersAcademy/LoginError.jsp");
		}
		
	}

}

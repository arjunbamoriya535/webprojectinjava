package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminError")
public class AdminError {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		request.getRequestDispatcher("loginpage.html");
	}

}

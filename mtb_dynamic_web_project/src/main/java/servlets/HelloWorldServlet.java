package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mitra
 *
 */

@WebServlet("/hello-world")
public class HelloWorldServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1 align='center'>Welcome to <a href='http://www.mitrajt.com/'>Mitrajit's Tech Blog</a><h1>");
		out.println("<h2 align='center'>This is my first dynamic web project using Maven in Eclipse IDE<h2>");
		out.flush();
		out.close();
	}
}

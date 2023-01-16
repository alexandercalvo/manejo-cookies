package org.learning.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/login", "/login.html"}	)
public class LogingServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(USERNAME.equals(username) && PASSWORD.equals(password)) {
			Cookie cookie = new Cookie("username", username);
			resp.addCookie(cookie);
			resp.setContentType("text/html;charset=UTF-8");
			resp.setContentType("text/html");
			try (PrintWriter out = resp.getWriter()) {
				out.println("<DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>Probando login</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>Probando login</h1>");
				out.println("<p>Hola"+ username +" Iniciaste sesion con exito</p>");
				out.println("</body>");
				out.println("<html>");

			}
		}else {
			resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "lo sentimos no estas autorizado");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
		 Cookie [] cookies = req.getCookies() !=null ? req.getCookies() : new Cookie[0];
		 Optional<Cookie> userCookie = Arrays.stream(cookies)
				 .filter(cookie-> "username".equals(cookie.getName()))
				 .findFirst();
		 
		 if(userCookie.isPresent()) {
			 resp.setContentType("text/html");
			try (PrintWriter out = resp.getWriter()) {
				out.println("<DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>title</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>Welcome con las cookie</h1>");
				out.println("<p>Hola "+ userCookie.get().getValue()+"ya has  Iniciado  sesion con anterioridad</p>");
				out.println("</body>");
				out.println("<html>");

			}
		 }else {
			 getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
		 }
	}
	final static String USERNAME = "admin";
	final static String PASSWORD ="1234";
}

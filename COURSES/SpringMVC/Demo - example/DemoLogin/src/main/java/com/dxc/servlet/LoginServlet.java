package com.dxc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.model.User;

public class LoginServlet extends HttpServlet implements defaulUser{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("USER")== null){
			response.getWriter().append("You are still not logged in");
			response.getWriter().println("<a href='Login.jsp'>Click here to comeback login screen</a>");
		}else{
			doPost(request, response);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER");
		if(user == null){
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			user = new User(userName, password);
		}
		if(dUser.getUserName().equals(user.getUserName()) && dUser.getPassword().equals(user.getPassword())){
			session.setAttribute("USER", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
			rd.forward(request, response);
		}
		else{
			response.getWriter().append("Your password or user name is wrong");
			response.getWriter().println("<a href='Login.jsp'>Click here to comeback login screen</a>");
		}
	}
}

package com.dxc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.model.User;

public class ChangePasswordServlet extends HttpServlet implements defaulUser{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String passOld = req.getParameter("passOld");
		String passNew = req.getParameter("passNew");
		User user = (User) session.getAttribute("USER");
		if(user.getPassword().equals(passOld)){
			user.setPassword(passNew);
			session.setAttribute("USER", user);
			System.out.println(user.getPassword());
			resp.getWriter().write("Change password success!");
		}
		else {
			resp.getWriter().write("password old invalid!");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}

package com.chile.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chile.data.Data;


public class loginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	//private HttpSession session = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("username") != null) {
			
			resp.sendRedirect(req.getContextPath());
		}else {
			req.setAttribute("cur_username", Data.username);
			req.setAttribute("cur_password", Data.password);
			req.setAttribute("username", req.getAttribute("username"));
			req.setAttribute("password", req.getAttribute("password"));
			req.setAttribute("err", req.getAttribute("err"));
			req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		String err  = "";
	
		
		if(!Data.username.equals(username) || !Data.password.equals(password)){
			err = "Username or Password is invalid";
		}
			
		
		if(err == "") {
			
			
		    HttpSession session = req.getSession();
			session.setAttribute("username", username);
			
			resp.sendRedirect(req.getContextPath());
		}else {
		
			req.setAttribute("username", username);
			req.setAttribute("password", password);
			req.setAttribute("err", err);
			doGet(req, resp);
		}
	}
	


}

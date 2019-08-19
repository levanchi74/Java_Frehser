package com.chile.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class profileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		if(session.getAttribute("username") == null) {
			resp.sendRedirect(req.getContextPath()+"/login?message=Youarenotloggedin");
		}else {
			
			req.setAttribute("sessionId", session.getId());
			req.setAttribute("username", session.getAttribute("username"));
			
			req.getRequestDispatcher("/jsp/profile.jsp").forward(req, resp);
			
		}
	}
}

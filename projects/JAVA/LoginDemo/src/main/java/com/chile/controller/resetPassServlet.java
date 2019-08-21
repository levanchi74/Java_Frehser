package com.chile.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chile.data.Data;


public class resetPassServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		if(session.getAttribute("username") == null) {
			resp.sendRedirect(req.getContextPath()+"/login?message=Youarenotloggedin");
		}else {
			
			req.setAttribute("pass", req.getAttribute("pass"));
			req.setAttribute("newPass", req.getAttribute("newPass"));
			req.setAttribute("confirmPass", req.getAttribute("confirmPass"));
			
			req.getRequestDispatcher("/jsp/resetpass.jsp").forward(req, resp);
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String pass = req.getParameter("pass");
		String newPass = req.getParameter("newPass");
		String confirmPass = req.getParameter("confirmPass");
		
		String pass_err= "",newPass_err="",confirmPass_err ="";
		
		if(!Data.password.equals(pass)) {
			pass_err = "Password is invalid !";
		}else if( newPass.isEmpty()){
			newPass_err = "Password is not empty !";
		}else if(!newPass.equals(confirmPass)) {
			confirmPass_err = "Confirm password not match";
		
		}
		
		if(pass_err == "" && newPass_err =="" && confirmPass_err == "") {
			Data.password = newPass;
			req.getSession().invalidate();
			
			resp.sendRedirect(req.getContextPath()+"/login?message=PleaseLoginAgain");
		}else {
			req.setAttribute("pass", pass);
			req.setAttribute("newPass", newPass);
			req.setAttribute("confirmPass", confirmPass);
			req.setAttribute("pass_err", pass_err);
			req.setAttribute("newPass_err", newPass_err);
			req.setAttribute("confirmPass_err", confirmPass_err);
			doGet(req, resp);
		}
		
	}

}

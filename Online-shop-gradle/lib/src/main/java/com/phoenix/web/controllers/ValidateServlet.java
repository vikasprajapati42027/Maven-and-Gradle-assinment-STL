package com.phoenix.web.controllers;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;
import com.phoenix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	  response.setContentType("text/html");
	  
	  String uname=request.getParameter("username");
	  String password=request.getParameter("passwd");
	  
	  LoginBean obj=new LoginBean();
	  request.setAttribute("ob", obj);
	  obj.setUsername(uname);
	  obj.setPassword(password);  
	  PrintWriter out=response.getWriter();
	  
	  try {
		try {
			if(obj.isValid())
			  {
				  RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				  rd.forward(request, response);
			  }else {
				  out.println("<h3 style='color:red;'>Invalid Login</h3>");
				  RequestDispatcher rd=request.getRequestDispatcher("login.html");
				  rd.include(request, response);
			  }
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  catch (ServletException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (UserNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

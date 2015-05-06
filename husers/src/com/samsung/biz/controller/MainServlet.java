package com.samsung.biz.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.biz.dao.HusersDAO;
import com.samsung.biz.vo.Husers;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("insertUser")){
			insertUser(request, response);
		}else if(action.equalsIgnoreCase("getUserList")){
			getUserList(request, response);
		}else{
			response.sendRedirect("getUserList.jsp");
		}
		
	}

	private void getUserList(HttpServletRequest request,
			HttpServletResponse response) {
		HusersDAO dao = new HusersDAO();
		List<Husers> list = dao.getUserList();
		request.setAttribute("list", list);
		try {
			request.getRequestDispatcher("getUserList.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	private void insertUser(HttpServletRequest request,
			HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		int gender = Integer.parseInt(request.getParameter("gender"));
		
		Husers user = new Husers();
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setAge(age);
		user.setGender(gender);
		
		HusersDAO dao = new HusersDAO();
		dao.insertUser(user);
		
		try {
			response.sendRedirect("main.do?action=getUserList");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

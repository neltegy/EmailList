<%@page import="com.javaex.dao.EmaillistDao"%>
<%@page import="com.javaex.vo.EmaillistVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8");
	String lastname = request.getParameter("ln");
	String firstname = request.getParameter("fn");
	String email = request.getParameter("email");
	
	EmaillistVo vo = new EmaillistVo(1,lastname,firstname,email);
	
	EmaillistDao dao = new EmaillistDao();
	dao.insert(vo);
	
	response.sendRedirect("list.jsp");
%>
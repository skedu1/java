<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

<%
String item = request.getParameter("item");
ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");

if (!cart.contains(item)) {
    cart.add(item);
}

response.sendRedirect("index.jsp");
%>
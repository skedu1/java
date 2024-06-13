<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

<%
ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
if (cart == null) {
    cart = new ArrayList<String>();
    session.setAttribute("cart", cart);
}
%>

<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h2>Add Item To Cart</h2>
    <form action="addItem.jsp" method="post">
        <label>Item Name:</label>
        <input type="text" name="item" required>
        <input type="submit" value="Add to Cart">
    </form>

    <h2>Shopping Cart</h2>
    <table>
        <tr>
            <th>Item</th>
            <th>Action</th>
        </tr>
        <% for (String item : cart) { %>
        <tr>
            <td><%=item%></td>
            <td><a href="removeItem.jsp?item=<%=item%>">Remove</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
package com;

import java.*;
import javax.servlet.*;

public class CheckVoter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("uname");
        int age = Integer.parseInt(request.getParameter("age"));
        
        out.println("<html><body>");
        if (age >= 18) {
            out.println("<h4 style='color: green'>" + name + ", you are eligible to vote.</h4>");
        } else {
            out.println("<h4 style='color: red'>" + name + ", you are not eligible to vote.</h4>");
        }
        out.println("<a href='index.html'>Home</a>");
        out.println("</body></html>");
    }
}
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                max-width: 400px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                display: inline-block;\n");
      out.write("                widows: 100px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>Registration Page</h1></center>\n");
      out.write("    <form action=\"StudInfo.jsp\" method=\"post\">\n");
      out.write("        <label for=\"regNo\"> Regn Num:</label>\n");
      out.write("        <input type=\"text\" id=\"regNo\" name=\"regNo\" maxlength=\"30\" /><br>\n");
      out.write("        \n");
      out.write("        <label for=\"firstName\"> First Name:</label>\n");
      out.write("        <input type=\"text\" id=\"firstName\" name=\"firstName\" maxlength=\"30\" /><br>\n");
      out.write("        \n");
      out.write("        <label for=\"lastName\"> Last Name:</label>\n");
      out.write("        <input type=\"text\" id=\"lastName\" name=\"lastName\" maxlength=\"30\" /><br>\n");
      out.write("        \n");
      out.write("        <label for=\"course\"> Course:</label>\n");
      out.write("        <input type=\"text\" id=\"course\" name=\"course\" maxlength=\"30\" /><br>\n");
      out.write("        \n");
      out.write("        <label for=\"sem\">Sem:</label>\n");
      out.write("        <input type=\"text\" id=\"sem\" name=\"sem\" maxlength=\"30\" /><br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Submit\" /> \n");
      out.write("        <input type=\"reset\" value=\"Reset\" />\n");
      out.write("    </form> \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

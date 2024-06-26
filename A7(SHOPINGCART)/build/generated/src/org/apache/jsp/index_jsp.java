package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");

ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
if (cart == null) {
    cart = new ArrayList<String>();
    session.setAttribute("cart", cart);
}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Shopping Cart</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Add Item To Cart</h2>\n");
      out.write("    <form action=\"addItem.jsp\" method=\"post\">\n");
      out.write("        <label>Item Name:</label>\n");
      out.write("        <input type=\"text\" name=\"item\" required>\n");
      out.write("        <input type=\"submit\" value=\"Add to Cart\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <h2>Shopping Cart</h2>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Item</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 for (String item : cart) { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(item);
      out.write("</td>\n");
      out.write("            <td><a href=\"removeItem.jsp?item=");
      out.print(item);
      out.write("\">Remove</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
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

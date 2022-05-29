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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  \n");
      out.write("  <title>Sri pet</title>\n");
      out.write("</head>\n");
      out.write("<link href=\"public/assets/css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <header>\n");
      out.write("    <div>\n");
      out.write("     <i class=\"fa fa-paw\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("      <p>Sri Pet</p>\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Events</a></li>\n");
      out.write("        <li><a href=\"#\">bla bla bla</a></li>\n");
      out.write("        <li><a href=\"register.jsp\">Sign up</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">Sign in</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <section class=\"titles\">\n");
      out.write("\n");
      out.write("    <h1>Sri Pet</h1>\n");
      out.write("    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam maiores consectetur, laboriosam rerum obcaecati.</p>\n");
      out.write("\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section class=\"container-boxes\">\n");
      out.write("    <div class=\"box\">\n");
      out.write("\n");
      out.write("      <div class=\"icon\">\n");
      out.write("        <a href=\"\"><i class=\"fas fa-dog\" aria-hidden=\"true\"></i></a>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Pacifico\" rel=\"stylesheet\"> \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"text\">\n");
      out.write("        <a href=\"\">\n");
      out.write("          <h3>Lost or Found</h3>\n");
      out.write("          <p>bla bla bla bla bla bla bla bla bla bla.</p>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"box\">\n");
      out.write("\n");
      out.write("      <div class=\"icon\">\n");
      out.write("        <a href<i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("</a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"text\">\n");
      out.write("        <a href=\"\">\n");
      out.write("          <h3>The Shelter</h3>\n");
      out.write("          <p>We will use only animal-friendly, fair-trade yarn. Only the best!</p>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"box\">\n");
      out.write("\n");
      out.write("      <div class=\"icon\">\n");
      out.write("        <a href=\"\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i>\n");
      out.write("</a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"text\">\n");
      out.write("        <a href=\"\">\n");
      out.write("          <h3>The Group</h3>\n");
      out.write("          <p>Become a member, become family. Teamwork is everything.</p>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

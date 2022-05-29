package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>I Pet Event Reg</title>\n");
      out.write("\n");
      out.write("    <link href=\"public/assets/css/addevent.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
  String display = "block";
    String pic = "none";
    if(request.getQueryString()!= null){
        display = "none";
        pic = "block";
    }

      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div style=\"display: ");
      out.print(display);
      out.write("\">\n");
      out.write("            <form method=\"POST\" class=\"appointment-form\" action=\"createEvent\" id=\"appointment-form\">\n");
      out.write("                <h2>Event Registration Form</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group-1\">\n");
      out.write("                    <label for=\"title\" style=\"color: #222; font-weight: bold\">Event Title</label>\n");
      out.write("                    <input type=\"text\" name=\"title\" id=\"title\" required />\n");
      out.write("                    <label for=\"date\" style=\"color: #222; font-weight: bold\">Event Due Date</label>\n");
      out.write("                    <input type=\"date\" name=\"date\" id=\"date\"  required />\n");
      out.write("                    <label for=\"time\" style=\"color: #222; font-weight: bold\">Event Due Time</label>\n");
      out.write("                    <input type=\"time\" name=\"time\" id=\"time\" placeholder=\"Time\" required />\n");
      out.write("                    <label for=\"place\" style=\"color: #222; font-weight: bold\">Event Venue</label>\n");
      out.write("                    <input type=\"text\" name=\"place\" id=\"place\"  required />\n");
      out.write("                    <label for=\"type\" style=\"color: #222; font-weight: bold\">Event Type</label>\n");
      out.write("                    <input type=\"text\" name=\"type\" id=\"type\" required />\n");
      out.write("                    <label for=\"desc\" style=\"color: #222; font-weight: bold\">Event Description</label>\n");
      out.write("                    <input type=\"text\" name=\"desc\" id=\"desc\" required />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-submit\">\n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submit\" value=\"Create an Event\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("                <!--Image-->\n");
      out.write("                <div style=\"display:");
      out.print(pic);
      out.write(" ; padding:3rem;\">\n");
      out.write("                    <form action=\"imageEvent\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <label for=\"file\" style=\"color: #222; font-weight: bold\">Include Event Image</label>\n");
      out.write("                    <input type=\"file\" required accept=\"image/png, image/jpeg\" name=\"file\" size=\"50\" />\n");
      out.write("                    <div class=\"form-submit\">\n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submit\" value=\"Include Image\" />\n");
      out.write("                    <kbd style=\"background-color: orangered; padding: 5px;\"><a style=\"text-decoration: none; color:white;\" href=\"admin.jsp\">Skip</a></kbd>\n");
      out.write("                </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
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

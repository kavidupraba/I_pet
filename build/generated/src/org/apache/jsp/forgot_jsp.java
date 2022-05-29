package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\" rel='stylesheet' type='text/css'> \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:100,300,400,700\" rel='stylesheet' type='text/css'> \n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel='stylesheet' type='text/css'> \n");
      out.write("        <title>iPET Reset</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background: #0250c5;\n");
      out.write("\t background: -webkit-gradient(linear, left bottom, left top, from(#0250c5), to(#d43f8d));\n");
      out.write("\t background: -webkit-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: -moz-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: -o-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: linear-gradient(to top, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: -webkit-gradient(linear, left bottom, left top, from(#0250c5), to(#d43f8d));\n");
      out.write("\t background: -webkit-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: -moz-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: -o-linear-gradient(bottom, #0250c5 0%, #d43f8d 100%);\n");
      out.write("\t background: linear-gradient(to top, #0250c5 0%, #d43f8d 100%);\n");
      out.write("  font-family: 'Lato';\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-btn {\n");
      out.write("  margin-right: 6px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("    </div>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                      <div class=\"panel-body\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          <h3><i class=\"fa fa-lock fa-4x\"></i></h3>\n");
      out.write("                          <h2 class=\"text-center\">Forgot Password?</h2>\n");
      out.write("                          <p>You can reset your password here.</p>\n");
      out.write("                          <div class=\"panel-body\">\n");
      out.write("            \n");
      out.write("                            <form id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("            \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                  <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope color-blue\"></i></span>\n");
      out.write("                                  <input id=\"email\" name=\"email\" placeholder=\"email address\" class=\"form-control\"  type=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <input name=\"recover-submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Reset Password\" type=\"submit\">\n");
      out.write("                              </div>\n");
      out.write("                              \n");
      out.write("                              <input type=\"hidden\" class=\"hide\" name=\"token\" id=\"token\" value=\"\"> \n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("\n");
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

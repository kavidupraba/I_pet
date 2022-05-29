package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("            ");

                String nic = "";
            if(request.getQueryString()!=null){
            nic = request.getParameter("nic");
            }
            
      out.write("\n");
      out.write("\n");
      out.write("body {\n");
      out.write("background: #2980B9;  /* fallback for old browsers */\n");
      out.write("background: -webkit-linear-gradient(to bottom, #FFFFFF, #6DD5FA, #2980B9);  /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("background: linear-gradient(to bottom, #FFFFFF, #6DD5FA, #2980B9); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("\n");
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
      out.write("                              <form  action=\"forget\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("            \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                  <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user color-blue\"></i></span>\n");
      out.write("                                  <input name=\"nic\" placeholder=\"NIC\" value=\"");
      out.print(nic);
      out.write("\" maxlength=\"12\" minlength=\"10\" required class=\"form-control\"  type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <input name=\"recover-submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Request OTP\" type=\"submit\">\n");
      out.write("                              </div>\n");
      out.write("                            </form>\n");
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

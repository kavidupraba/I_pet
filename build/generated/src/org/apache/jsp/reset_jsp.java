package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reset_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            ");

            if(session.getAttribute("mail") == null){
             response.sendRedirect(request.getContextPath()+"/forget.jsp");
            }
            
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
      out.write(".wrap {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  border: 1px solid rgba(0, 0, 0, 0.2);\n");
      out.write("  display: flex;\n");
      out.write("  width: 192px;\n");
      out.write("  height: 58px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".display {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  border-right: 1px solid rgba(0, 0, 0, 0.2);\n");
      out.write("  display: flex;\n");
      out.write("  flex: 1;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  font-size: 32px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".display:last-child {\n");
      out.write("  border-right: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  position: absolute;\n");
      out.write("  border: none;\n");
      out.write("  font-size: 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: transparent;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".shadows {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  right: 0;\n");
      out.write("  box-shadow: 0 0 0 4px rgba(58, 151, 212, 0.28);\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#btnSubmit\").click(function () {\n");
      out.write("                    var password = $(\"#txtPassword\").val();\n");
      out.write("                    var confirmPassword = $(\"#txtConfirmPassword\").val();\n");
      out.write("                    if (password != confirmPassword) {\n");
      out.write("                        alert(\"Passwords do not match.\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    return true;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id=\"root\"></div>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("    </div>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                      <div class=\"panel-body\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          <h3><i class=\"fa fa-unlock-alt fa-4x\"></i></h3>\n");
      out.write("                          <h2 class=\"text-center\">Reset Your Password!</h2>\n");
      out.write("                          <p>You can reset your password here.</p>\n");
      out.write("                          <div class=\"panel-body\">\n");
      out.write("            \n");
      out.write("                              <form id=\"register-form\" role=\"form\" action=\"reset\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("            \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                  <span class=\"input-group-addon\"><i class=\"fa fa-key\"></i></span>\n");
      out.write("                                  <input id=\"txtPassword\" minlength='6' name=\"password\" placeholder=\"new password\" class=\"form-control\"  type=\"password\" required>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                  <span class=\"input-group-addon\"><i class=\"fa fa-key\"></i></span>\n");
      out.write("                                  <input id=\"txtConfirmPassword\" minlength='6' name=\"cpassword\" placeholder=\"confirm password\" class=\"form-control\"  type=\"password\" required>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <button type=\"submit\" id=\"btnSubmit\" class=\"btn btn-primary\">\n");
      out.write("                                    <i class=\"fa fa-btn fa-refresh\"></i>Reset Password\n");
      out.write("                                </button>\n");
      out.write("                               \n");
      out.write("                              </div>\n");
      out.write("                              \n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/react/16.7.0/umd/react.production.min.js\"></script> \n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/react-dom/16.7.0/umd/react-dom.production.min.js\"></script> \n");
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

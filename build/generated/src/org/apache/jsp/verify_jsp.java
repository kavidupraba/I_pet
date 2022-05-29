package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Verify Passcode</title>\n");
      out.write("        <style>\n");
      out.write("            ");

            if(session.getAttribute("otp")== null || session.getAttribute("mail")== null){
            response.sendRedirect(request.getContextPath() + "/forget.jsp");
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
      out.write("        \n");
      out.write("        <script>\n");
      out.write("function restrictAlphabets(e){\n");
      out.write("\t\t\t\tvar x=e.which||e.keycode;\n");
      out.write("\t\t\t\tif((x>=48 && x<=57) || x==8 ||\n");
      out.write("\t\t\t\t\t(x>=35 && x<=40)|| x==46)\n");
      out.write("\t\t\t\t\treturn true;\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("    </div>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                      <div class=\"panel-body\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          <h3><i class=\"fa fa-key fa-4x\"></i></h3>\n");
      out.write("                          <h3>Please enter the 6-digit verification code we sent via Email:</h3>\n");
      out.write("                          <span>(we want to make sure it's you)</span>\n");
      out.write("                          <div class=\"panel-body\">\n");
      out.write("            \n");
      out.write("                            <form id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("            \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                  <span class=\"input-group-addon\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
      out.write("                                  </span>\n");
      out.write("                                  <input id=\"txtchar\" name=\"txtchar\" placeholder=\"enter 6-Digit Verify Code\" class=\"form-control\" type=\"text\"  min=\"0\" maxlength=\"6\" onkeypress='return restrictAlphabets(event)'>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <input name=\"verify-submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Verify\" type=\"submit\">\n");
      out.write("                              </div>\n");
      out.write("                            \n");
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
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("    </html>");
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

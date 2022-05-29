package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>I Pet Registration</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("    <!-- STYLE CSS -->\n");
      out.write("    <link href=\"public/assets/css/ureg.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <!-- Javascript code to derive gender and dob  -->\n");
      out.write("    <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("         $(function () {\n");
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
      out.write("        \n");
      out.write("      function reviewNIC() {\n");
      out.write("        var gender, fullDate, byr, bdate;\n");
      out.write("\n");
      out.write("        var nic = document.getElementById(\"nic\").value;\n");
      out.write("        var dob = document.getElementById(\"dob\");\n");
      out.write("        var sex = document.getElementById(\"sex\");\n");
      out.write("\n");
      out.write("        // Verify Old Id\n");
      out.write("        if (nic.length == 10 && (nic.includes(\"V\") || nic.includes(\"v\"))) {\n");
      out.write("          byr = nic.slice(0, 2);\n");
      out.write("          bdate = nic.slice(2, 5);\n");
      out.write("          if (bdate >= 001 && bdate <= 366) {\n");
      out.write("            gender = \"Male\";\n");
      out.write("            byr = \"19\" + byr;\n");
      out.write("            console.log(\"Birth Year :\" + byr);\n");
      out.write("            fullDate = dateFromDay(byr, bdate);\n");
      out.write("            fullDate = fullDate.toISOString().slice(0, 10);\n");
      out.write("            dob.value = fullDate;\n");
      out.write("            sex.value = gender;\n");
      out.write("          } else if (bdate >= 501 && bdate <= 866) {\n");
      out.write("            gender = \"Female\";\n");
      out.write("            byr = \"19\" + byr;\n");
      out.write("            console.log(\"Birth Year :\" + byr);\n");
      out.write("            fullDate = dateFromDay(byr, bdate);\n");
      out.write("            fullDate = fullDate.toISOString().slice(0, 10);\n");
      out.write("            dob.value = fullDate;\n");
      out.write("            sex.value = gender;\n");
      out.write("          } else {\n");
      out.write("            alert(\"Invalid NIC\");\n");
      out.write("            sex.value = \"\";\n");
      out.write("            dob.value = null;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        //Verify New Id\n");
      out.write("        else if (nic.length == 12) {\n");
      out.write("          byr = nic.slice(0, 4);\n");
      out.write("          bdate = nic.slice(4, 7);\n");
      out.write("          if (bdate >= 001 && bdate <= 366) {\n");
      out.write("            gender = \"Male\";\n");
      out.write("\n");
      out.write("            fullDate = dateFromDay(byr, bdate);\n");
      out.write("            fullDate = fullDate.toISOString().slice(0, 10);\n");
      out.write("            dob.value = fullDate;\n");
      out.write("            sex.value = gender;\n");
      out.write("          } else if (bdate >= 501 && bdate <= 866) {\n");
      out.write("            gender = \"Female\";\n");
      out.write("            fullDate = dateFromDay(byr, bdate);\n");
      out.write("            fullDate = fullDate.toISOString().slice(0, 10);\n");
      out.write("            dob.value = fullDate;\n");
      out.write("            sex.value = gender;\n");
      out.write("          } else {\n");
      out.write("\t\t\talert(\"Invalid NIC\");\n");
      out.write("            sex.value = \"\";\n");
      out.write("            dob.value = null;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        //Not Valid Id\n");
      out.write("        else {\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function dateFromDay(year, day) {\n");
      out.write("        var date = new Date(year, 0); // initialize a date in `year-01-01`\n");
      out.write("        return new Date(date.setDate(day)); // add the number of days\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div\n");
      out.write("      class=\"wrapper\"\n");
      out.write("      style=\"background-image: url('public/assets/images/regback.jpg');\"\n");
      out.write("    >\n");
      out.write("      <div class=\"inner\">\n");
      out.write("        <div class=\"image-holder\">\n");
      out.write("          <img src=\"public/assets/images/regform.jpg\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("          <form action=\"register\" method=\"post\">\n");
      out.write("          <h3>Registration Form</h3>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"First Name\"\n");
      out.write("              name=\"fname\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"Last Name\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              name=\"lname\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-wrapper\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"NIC\"\n");
      out.write("              id=\"nic\"\n");
      out.write("              name=\"nic\"\n");
      out.write("              onkeyup=\"reviewNIC()\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("              maxlength=\"12\"\n");
      out.write("              minlength=\"10\"\n");
      out.write("            />\n");
      out.write("            <i class=\"zmdi zmdi-account\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"Gender\"\n");
      out.write("              id=\"sex\"\n");
      out.write("              name=\"sex\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <input\n");
      out.write("              type=\"date\"\n");
      out.write("              placeholder=\"DOB\"\n");
      out.write("              id=\"dob\"\n");
      out.write("              name=\"dob\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-wrapper\">\n");
      out.write("            <input\n");
      out.write("              type=\"email\"\n");
      out.write("              name=\"email\"\n");
      out.write("              placeholder=\"Email Address\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <i class=\"zmdi zmdi-email\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-wrapper\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              name=\"address\"\n");
      out.write("              placeholder=\"Address\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <i class=\"zmdi zmdi-pin\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"City\"\n");
      out.write("              name=\"city\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              placeholder=\"District\"\n");
      out.write("              name=\"district\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-wrapper\">\n");
      out.write("            <input\n");
      out.write("              type=\"password\"\n");
      out.write("              placeholder=\"Password (min 6 char)\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              minlength=\"6\"\n");
      out.write("              id=\"txtPassword\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <i class=\"zmdi zmdi-lock\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-wrapper\">\n");
      out.write("            <input\n");
      out.write("              type=\"password\"\n");
      out.write("              placeholder=\"Confirm Password\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              name=\"password\"\n");
      out.write("              minlength=\"6\"\n");
      out.write("              id=\"txtConfirmPassword\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("            <i class=\"zmdi zmdi-lock\"></i>\n");
      out.write("          </div>\n");
      out.write("          <button id=\"btnSubmit\">\n");
      out.write("            Register\n");
      out.write("            <i class=\"zmdi zmdi-arrow-right\"></i>\n");
      out.write("          </button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

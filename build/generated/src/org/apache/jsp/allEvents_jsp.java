package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Connections;
import java.sql.*;

public final class allEvents_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie-edge\">\n");
      out.write("\n");
      out.write("    <title>All Events</title>\n");
      out.write("\n");
      out.write("   <!--BootStrap and other links-->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" > \n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("   <link href=\"public/assets/css/events.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.3/jquery.min.js\"></script>\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.js\"></script>\n");
      out.write("   <link href=\"https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick-theme.min.css\" rel=\"stylesheet\" />\n");
      out.write("   <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    <h1 style=\"margin-left: 50%; margin-top: 20px;\">All Events</h1>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <!-- Bootstrap card -->\n");
      out.write("                ");
 
    Connection conn;
    Statement stat;
    ResultSet rs;
    String sql;
        
        Connections log = new Connections();
        log.Connect();
        conn = log.con;
        stat = log.qry;
        sql = "SELECT * from events";
        
        rs = stat.executeQuery(sql);
        while(rs.next()){
            int eid = rs.getInt("EID");
            String Title = rs.getString("Title");
            String Date = rs.getString("Date");
            String Time = rs.getString("Time");
            String Place= rs.getString("Place");
            String Type = rs.getString("Type");
            String Descr = rs.getString("Descr");
            String Thumb = rs.getString("Thumbnail");
            
                
      out.write(" \n");
      out.write("            <div class=\"col-4-lg\">\n");
      out.write("                <div class=\"card\" style=\"width: 20rem; height: 33rem;\">\n");
      out.write("                    <img src=\"public/data/");
      out.print(Thumb);
      out.write("\" height=\"225px\" alt=\"Card One\" class=\"card-img-top\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">");
      out.print(Title);
      out.write("</h5>\n");
      out.write("                        <span style=\"color: rgb(255, 0, 98); font-weight: bold;\">");
      out.print(Type);
      out.write("</span></br>\n");
      out.write("                        <span style=\"color: limegreen;\">");
      out.print(Place);
      out.write("</span></br>\n");
      out.write("                        ");
 int leng = Descr.length();
                            String text="";
                        
                        if(leng>=100){
                           text = Descr.substring(0, 49);
                           text = text + "...";
                        }
                        else{
                            text = Descr;
                        }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <p class=\"card-text\" style=\"margin-top: 5%;\">");
      out.print(text);
      out.write("</p>\n");
      out.write("\n");
      out.write("                        <a href=\"OneEvent.jsp?EID=");
      out.print(eid);
      out.write("\" class=\"btn btn-primary\">More</a>\n");
      out.write("                         <p class=\"card-text\"><small class=\"text-muted\">Startes on ");
      out.print(Date);
      out.write(" at ");
      out.print(Time);
      out.write("</small></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div> ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
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

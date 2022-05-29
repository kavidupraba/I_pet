<%@page import="model.Connections"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Infomation</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="public/assets/css/detail.css" rel="stylesheet" type="text/css"/>

</head>
<body>
  <%    String eid = "";
      if(request.getQueryString()==null){
          response.sendRedirect(request.getContextPath()+"/allEvents.jpg");
      }
      else{
      eid = request.getParameter("EID");
      }
      

  %>
    <div class="container">
   <% 
    Connection conn;
    Statement stat;
    ResultSet rs;
    String sql;
    
        Connections log = new Connections();
        log.Connect();
        conn = log.con;
        stat = log.qry;
        sql = "SELECT * from events WHERE EID='"+eid+"'";
        
        rs = stat.executeQuery(sql);
        while(rs.next()){
            String Title = rs.getString("Title");
            String Date = rs.getString("Date");
            String Time = rs.getString("Time");
            String Place= rs.getString("Place");
            String Type = rs.getString("Type");
            String Descr = rs.getString("Descr");
            String Thumb = rs.getString("Thumbnail");
            
                %> 
        <h1 class="font-weight-light text-center text-lg-middle mt-4 mb-0"><%=Title%></h1><hr>
        <div class="row justify-content-between">
            <div class="col-6"><img src="public/data/<%=Thumb%>" style="padding:1px;border:thin solid black;"  width="400px" height="400px"></div>
            <div class="col-6">
                <div style="color: crimson; font-weight: bold; font-size: 24pt;">TYPE :- <%= Type%>
                <div style="color:rgb(120, 44, 175); font-weight: bold; font-size: large; margin-top: 5%;" >Location :- <%=Place%></div>
                <kbd>Date :- <%=Date%></kbd>
                <kbd class="bg-warning text-dark" >Time :- <%=Time%></kbd>
                <div style="font-size: 24pt; margin-top: 5%;">Description</div><hr>
                    <p><%=Descr%></p>
                    <a href="login.jsp" class="btn btn-lg btn-primary">Join Event</a>
                </div>
              <%}%>
            </div>
        </div>
    
    </div>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
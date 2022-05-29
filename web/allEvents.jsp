<%@page import="model.Connections"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie-edge">

    <title>All Events</title>

   <!--BootStrap and other links-->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <link href="public/assets/css/events.css" rel="stylesheet" type="text/css"/>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.3/jquery.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.js"></script>
   <link href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick-theme.min.css" rel="stylesheet" />
   <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
   
</head>
<body>
   
    <h1 style="margin-left: 50%; margin-top: 20px;">All Events</h1>
    <div class="container">
        <div class="row">
                <!-- Bootstrap card -->
                <% 
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
            
                %> 
            <div class="col-4-lg">
                <div class="card" style="width: 20rem; height: 33rem;">
                    <img src="public/data/<%=Thumb%>" height="225px" alt="Card One" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title"><%=Title%></h5>
                        <span style="color: rgb(255, 0, 98); font-weight: bold;"><%=Type%></span></br>
                        <span style="color: limegreen;"><%=Place%></span></br>
                        <% int leng = Descr.length();
                            String text="";
                        
                        if(leng>=100){
                           text = Descr.substring(0, 49);
                           text = text + "...";
                        }
                        else{
                            text = Descr;
                        }
                        %>
                        
                        <p class="card-text" style="margin-top: 5%;"><%=text%></p>

                        <a href="OneEvent.jsp?EID=<%=eid%>" class="btn btn-primary">More</a>
                         <p class="card-text"><small class="text-muted">Startes on <%=Date%> at <%=Time%></small></p>
                    </div>
                </div>
                
            </div> <% } %>
            
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>I Pet Event Reg</title>

    <link href="public/assets/css/addevent.css" rel="stylesheet" type="text/css"/>
    
</head>
<body>

    <div class="main">
<%  String display = "block";
    String pic = "none";
    if(request.getQueryString()!= null){
        display = "none";
        pic = "block";
    }
%>
        <div class="container">
            <div style="display: <%=display%>">
            <form method="POST" class="appointment-form" action="createEvent" id="appointment-form">
                <h2>Event Registration Form</h2>
                
                <div class="form-group-1">
                    <label for="title" style="color: #222; font-weight: bold">Event Title</label>
                    <input type="text" name="title" id="title" required />
                    <label for="date" style="color: #222; font-weight: bold">Event Due Date</label>
                    <input type="date" name="date" id="date"  required />
                    <label for="time" style="color: #222; font-weight: bold">Event Due Time</label>
                    <input type="time" name="time" id="time" placeholder="Time" required />
                    <label for="place" style="color: #222; font-weight: bold">Event Venue</label>
                    <input type="text" name="place" id="place"  required />
                    <label for="type" style="color: #222; font-weight: bold">Event Type</label>
                    <input type="text" name="type" id="type" required />
                    <label for="desc" style="color: #222; font-weight: bold">Event Description</label>
                    <input type="text" name="desc" id="desc" required />
                </div>
                
                <div class="form-submit">
                    <input type="submit" name="submit" id="submit" class="submit" value="Create an Event" />
                </div>
            </form>
        </div>
                <!--Image-->
                <div style="display:<%=pic%> ; padding:3rem;">
                    <form action="imageEvent" method="post" enctype="multipart/form-data">
                    <label for="file" style="color: #222; font-weight: bold">Include Event Image</label>
                    <input type="file" required accept="image/png, image/jpeg" name="file" size="50" />
                    <div class="form-submit">
                    <input type="submit" name="submit" id="submit" class="submit" value="Include Image" />
                    <kbd style="background-color: orangered; padding: 5px;"><a style="text-decoration: none; color:white;" href="admin.jsp">Skip</a></kbd>
                </div>
                    </form>
                </div>
        </div>
    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <style>
    
     body{
     font-family:'Arial',sans-serif;
     background-color:back;
     margin:0;
     padding:0;
     justify-content:center;
     align-item:center;
     hegiht:100;
     with:100;
     
     }
     label
    {
      font-size:14px;
      color:#555;
      display:block;
      text-align:left;
      margin-bottom:6px;
     } 
     .container{
        
        background:#04fbff:
        margin:50px 25px;
        
     }

    </style>
  
</head>
<body>

    <div class="container">
    
        <h2>Admin Login</h2>
       
        <form action="Adminlogin" method="get">
            <div class="DD">
                Email: <input type="text" id="email" name="email" required>
                <br>
                <br>
                Password: <input type="password" id="password" name="password" required>
            </div>
            <br>
            <input type="submit" value="Submit">
        </form>
          <br>
        <p>Not User? <a href="Signup.jsp">Signup</a></p>
     </div>      

</body>
</html>
	
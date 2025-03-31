<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Project</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
        }
        
        .Container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        h1 { 
            font-size: 24px;
            color: #333;
            margin-bottom: 20px;
        }

        a {
            display: block;
            font-size: 18px;
            color: #007bff;
            text-decoration: none;
            margin: 10px 0;
            padding: 10px;
            border-radius: 4px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: #f0f0f0;
        }
        
        a:active {
            background-color: #e0e0e0;
        }
    </style>
</head>
<body>

    <div class="Container">
        <h1>Student Project</h1>
        <a href="Adminlogin.jsp">Admin</a>
        <a href="Studentlogin.jsp">Student</a>
    </div>

</body>
</html>
	
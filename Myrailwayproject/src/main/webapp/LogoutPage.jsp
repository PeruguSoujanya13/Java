<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 <head>
 <meta charset="UTF-8">
 <title>Insert title here</title>

 <style>
 #logoutSec{
 display:flex;
 flex-direction:column;
 align-items:center;
 justify-content:center;
 height: 100vh;
 }
 #logoutSec .linkText{
 font-size:small;
 font-weight:bold;
 }
 </style>

 </head>
 <body>
 <div id="logoutSec">
 <h3>Logged Out Successfully.. </h3>
 <a href="LoginPage.jsp"><span style="font-style: oblique;"
class="linkText">Click here to Login again</span></a>
 </div>
 </body>
 </html>
    
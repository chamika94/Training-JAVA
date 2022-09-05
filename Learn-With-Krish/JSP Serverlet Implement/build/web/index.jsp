<%-- 
    Document   : index
    Created on : Sep 6, 2022, 12:11:44 AM
    Author     : chami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <style>     
            .container{
               width: 100%;
               height:80px;
               background: darkgray;
            }
            
            li{
                float: left;
                text-decoration: none;
                list-style: none;
                padding: 10px;
            }
            
            li a{
                color: white;
                text-decoration: none;
            }
        </style>
        
        
    </head>
    <body>
        <div class="container">
            <nav>
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">PRODUCTS</a></li>
                    <li><a href="#">CONTACTS</a></li>
                    <li><a href="#">ABOUT</a></li>
                    <li style="float: right"><a href="login.jsp">LOGIN</a></li>
                    <li style="float: right"><a href="register.jsp">REGISTER</a></li>
                </ul>
            </nav>
        </div>
        
    </body>
</html>

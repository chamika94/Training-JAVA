<%-- 
    Document   : register
    Created on : Sep 6, 2022, 12:40:26 AM
    Author     : chami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .registercontainer{
                width:100%;
                height: auto;
                text-align: center;
            }
        </style>
        
    </head>
    <body>
        
        <div class="registercontainer">
            
            <form action="register" method="post">
                
                <label>Full Name</label><br/>
                <input type="text" placeholder="Enter Full Name" name="fname"><br/>
                
                <label></label><br/>
                <input type="text" placeholder="Enter Username" name="uname"><br/>
                 
                <label></label><br/>
                <input type="email" placeholder="Enter Email" name="email"><br/>
                  
                <label></label><br/>
                <input type="password" placeholder="Enter Password" name="psw"><br/>
                   
                <label></label><br/>
                <input type="password" placeholder="Confirm your password" name="cnfpsw"><br><br/>
                
                <input type="submit"  value="REGISTER">
                
            </form>
            
            
        </div>
        
        
    </body>
</html>

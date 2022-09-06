
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
/*import java.sql.Connection;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()) {

        } 
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
            PrintWriter out = response.getWriter();

            String fullname = request.getParameter("fname");
            String username = request.getParameter("uname");
            String email = request.getParameter("email");
            String password = request.getParameter("psw");
            String confirmpass = request.getParameter("cnfpsw");
            
            
            System.out.println(fullname);
            System.out.println(username);
            System.out.println(email);
            System.out.println(password);
            System.out.println(confirmpass);

            /*          try{
            Connection con;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManger.getConnection("jdbc:mysql://localhost:3306/","root","root");
            
            System.out.println("Connected");
            }catch(Exception e){
            System.out.println("ERROR : "+ e.getMessage());
            }*/
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

 
    

}

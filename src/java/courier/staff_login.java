/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pratik
 */
public class staff_login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ad_name = request.getParameter("txtusername");
        String ad_pass = request.getParameter("txtpassword");

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from staff_data");
            while (res.next()) {
                String uname = res.getString(2);
                String pass = res.getString(4);
                if (ad_name.equals(uname) && ad_pass.equals(pass)) {
                    RequestDispatcher rd = request.getRequestDispatcher("staff_home.html");
                    rd.forward(request, response);
                } else {
                    out.println("Invalid Credentials");
                    RequestDispatcher rd = request.getRequestDispatcher("staff_login.html");
                    rd.include(request, response);
                    break;
                }
            }
        } catch (Exception e) {
            out.println(e);
        }
    }

}
    

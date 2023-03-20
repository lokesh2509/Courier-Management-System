/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pratik
 */
public class update_status extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String courier_id = request.getParameter("courierid");
        String status = request.getParameter("status");

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/courier2";
            Connection connection = DriverManager.getConnection(url, "root", "root");
            Statement statement = connection.createStatement();

            String query = "update status set status='" + status  + "' where courier_id='" + courier_id + "'";

            int result = statement.executeUpdate(query);
        } catch (Exception e) {
            out.println(e);
        }

    }

}

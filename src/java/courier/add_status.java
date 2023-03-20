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
public class add_status extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String staff_name = request.getParameter("staff");
        String courier_id = request.getParameter("courierid");

        
        if(staff_name.equals("1")){
                    try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into status values(?,?,?)");
            pst.setString(2, "Lokesh");
            pst.setString(1, courier_id);
            pst.setString(3, "Staff Assigned");
            int row = pst.executeUpdate();
            out.println("Staff Assigend");
        } catch (Exception e) {
            out.println(e);
        }
        }
        else if(staff_name.equals("2")){
                    try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into status values(?,?,?)");
            pst.setString(2, "Tanya");
            pst.setString(1, courier_id);
            pst.setString(3, "Staff Assigned");
            int row = pst.executeUpdate();
            out.println("Staff Assigend");
        } catch (Exception e) {
            out.println(e);
        }
        }
        else if(staff_name.equals("3")){
                    try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into status values(?,?,?)");
            pst.setString(2, "Pratham");
            pst.setString(1, courier_id);
            pst.setString(3, "Staff Assigned");
            int row = pst.executeUpdate();
            out.println("Staff Assigend");
        } catch (Exception e) {
            out.println(e);
        }
        }
        else if(staff_name.equals("4")){
                    try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into status values(?,?,?)");
            pst.setString(2, "Shashank");
            pst.setString(1, courier_id);
            pst.setString(3, "Staff Assigned");
            int row = pst.executeUpdate();
            out.println("Staff Assigend");
        } catch (Exception e) {
            out.println(e);
        }
        }
        else if(staff_name.equals("5")){
                    try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
            PreparedStatement pst = con.prepareStatement("insert into status values(?,?,?)");
            pst.setString(2, "Pranav");
            pst.setString(1, courier_id);
            pst.setString(3, "Staff Assigned");
            int row = pst.executeUpdate();
            out.println("Staff Assigend");
        } catch (Exception e) {
            out.println(e);
        }
        }

    }

}

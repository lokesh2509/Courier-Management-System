/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pratik
 */
public class view_status_staff extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
         try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/courier2", "root", "root");
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery("select * from status");
                out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
"<html><head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n" +
"        <title>Admin</title>\n" +
"        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"    </head>\n" +
"    <body>\n" +
"\n" +
"\n" +
"\n" +
"<tr>\n" +
"    <td bgcolor=\"#FFFFFF\"><div align=\"center\"> <br>\n" +
"            <br>\n" +
"            <table bgcolor=\"#ECECEC\" border=\"0\" cellpadding=\"2\" cellspacing=\"2\" align=\"center\" width=\"50%\">\n" +
"                <thead>\n" +
"                <td>\n" +
"                    Courier ID\n" +
"                </td>\n" +
"                <td>\n" +
"                    Staff Name\n" +
"                </td>\n" +
"                <td>\n" +
"                    Status\n" +
"                </td>\n" +
"                </thead>\n" +
"                <tbody>");
                while (res.next()) {
                        out.println("<tr>\n" +
"                        <td>"+res.getString(1)+"</td>\n" +
"                        <td>"+res.getString(2)+"</td>\n" +
"                        <td>"+res.getString(3)+"</td>\n" +
"                    </tr>");
                }
            } catch (Exception e) {
                out.println(e);
            }
    }

}

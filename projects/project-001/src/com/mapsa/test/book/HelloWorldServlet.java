package com.mapsa.test.book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author Esmaeil Sadeghi, 7/23/20 11:55 AM
 */
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/book")
public class HelloWorldServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("usernaem");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<p>Title</p>");
        writer.write("<p>" + new Date() +"</p>");
        writer.write("<h>" + "your data send successfully!,  </h>");
        writer.write("<h>" + " welcom  " + username +"</h>");
        writer.write("<h>" + " servlet Hello world </h>");
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<p>Title</p>");
        writer.write("<h1>" + new Date() +"</h1>");
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }
}

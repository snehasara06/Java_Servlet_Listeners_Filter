package Kgisl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Serv2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


ServletContext ctx = getServletContext();
String driverName=ctx.getInitParameter("dname");  
System.out.println(ctx.getInitParameter(driverName));

        PrintWriter out = resp.getWriter();
        // out.println("Hai "+req.getParameter("uName"));
        HttpSession session = req.getSession();
        String uName = (String) session.getAttribute("uName");
        if (uName != null) {
            out.println("Hai " + uName);
        } else {
            out.println("User not authenticated.");
        }
    }
}

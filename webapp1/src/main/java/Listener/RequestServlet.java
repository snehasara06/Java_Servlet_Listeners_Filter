package Listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        System.out.println("COUNT: "+RequestListener.count);
        
        out.println("Hit Count - Request listener :" + RequestListener.count);
        req.setAttribute("Name", "Sneha");
        req.setAttribute("Location", "CBE");
        req.setAttribute("Age",22);
        req.removeAttribute("Age");
        out.println("<br>"+req.getAttribute("Name"));
        out.println("<br>"+req.getAttribute("Location"));

    }

}

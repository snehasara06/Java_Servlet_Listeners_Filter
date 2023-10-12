package Kgisl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Serv1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        if( username.equals("sneha") && password.equals("kgisl")){
        RequestDispatcher dispatcher=req.getRequestDispatcher("/serv2");
        dispatcher.include(req, resp);
        }
        else if(username.equals("sneha")){
        out.println("Wrong password ");
        RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
        dispatcher.include(req, resp);
        }
        else {
        out.println("Wrong username ");
        RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
        dispatcher.include(req, resp);
        }

        if (username.equals("sneha") && password.equals("kgisl")) {
            HttpSession session = req.getSession();
            session.setAttribute("uName", username);   
    //encodeRedirectURL()- ensure that session information is properly propagated 
    //                      when sending a redirect response to the client. 
            resp.sendRedirect(resp.encodeRedirectURL("/serv2"));

        } else {
            resp.sendRedirect(resp.encodeRedirectURL("/index.jsp"));
        }
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

ServletContext ctx = getServletContext();
String driverName=ctx.getInitParameter("dname");  
System.out.println(ctx.getInitParameter(driverName));

    // setContentType() - set the MIME (Multipurpose Internet Mail Extensions) 
    //                  - type of the response content that will be sent back to the client's browser. 
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
    // isCommitted()- check whether any portion of the response has been sent to the client yet           
        if (!response.isCommitted()) {
            out.println("<html>");
            out.println("<head><title>isCommitted Example</title></head>");
            out.println("<body>");
            out.println("<h1>Response has not been committed yet.</h1>");
            out.println("</body></html>");
        } else {
            out.println("<html>");
            out.println("<head><title>isCommitted Example</title></head>");
            out.println("<body>");
            out.println("<h1>Response has already been committed.</h1>");
            out.println("</body></html>");
        }
// addCookie(Cookie cookie) - add a cookie to the response that will be sent to the client's browser.
        Cookie cookie = new Cookie("username", "sneha");       
        cookie.setMaxAge(60 * 60 * 24 * 30); //30 days
        cookie.setPath("/"); 
        response.addCookie(cookie);
        response.setContentType("text/html");
        out.println("Cookie 'username' has been set.");
    }


}
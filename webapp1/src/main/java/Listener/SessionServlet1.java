package Listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        HttpSession session=req.getSession();
       PrintWriter out=resp.getWriter();
       session.setMaxInactiveInterval(120);
        out.println(SessionListener1.sessionCount);
        session.setAttribute("Satellite", "Chandrayaan3");
        session.setAttribute("Satellite", "Vikram Lander");
    }
}

package Listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        	HttpSession session=req.getSession();
	session.setAttribute("a1", "SCJP");
	session.setAttribute("a1", "SCWCD");
	session.setAttribute("a2", new SessionListener2());
	session.setAttribute("a3", new SessionListener2());
	session.setAttribute("a2", new SessionListener2());
	session.removeAttribute("a2");
	session.setAttribute("a1", new SessionListener2());
	
	
	out.println("HttpSessionBindingListener not required to configure");
    }
}

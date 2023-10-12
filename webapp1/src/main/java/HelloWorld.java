import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

    {
        System.out.println("HelloWorld Class Block");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("HelloWorld Init");
    }

    // @Override
    // protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
    // throws ServletException, IOException {
    // System.out.println("HelloWorld Service");
    // }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("HelloWorld Get");
        PrintWriter out = res.getWriter();
        String name=req.getParameter("name");
        res.setContentType("text/html");
        out.println("<h2>Hello "+ name+" !</h2>");
        out.println("Java Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloWorld Post");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        out.print("<h2><b> Welcome " + firstname + " " + lastname + "! </b></h2>");
        
    }
}

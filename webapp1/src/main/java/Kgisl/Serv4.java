package Kgisl;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx = req.getServletContext();
        String driverName = ctx.getInitParameter("dname");
        System.out.println((driverName));

        ServletConfig config = getServletConfig();
        String initparam = config.getInitParameter("initparam");
        System.out.println((initparam));
    }
}

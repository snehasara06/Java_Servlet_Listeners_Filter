package Kgisl;
import java.io.IOException;
// import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Serv3 extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        // PrintWriter out = response.getWriter();
        // String isro = request.getParameter("name");
        response.sendRedirect("https://www.isro.gov.in/");
       
    }
}

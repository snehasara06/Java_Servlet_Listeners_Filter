package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
// getParameter(String name)-returns the value of parameter of  request type 
//                           on the text file
        String name = req.getParameter("empName");
        String id = req.getParameter("empId");
        String dept = req.getParameter("empDept");
        String email = req.getParameter("empEmail");
// getParameterValues(String name)-retrieve multiple values
//                                -associated with a specific parameter name
        String[] products = req.getParameterValues("product");

        out.println("<h1><b>  EMPLOYEE DETAILS\n</b></h1>" +
                "NAME: " + name +
                "<br>" + "ID: " + id +
                "<br>" + "DEPARTMENT: " + dept +
                "<br>" + "EMAIL: " + email);
        if (products != null) {
            resp.getWriter().println("<br>PRODUCTS: ");
            for (String p : products) {
                resp.getWriter().println("<ul>" + p + "</ul>");
            }
        } else {
            resp.getWriter().println("<p> No product selected.</p>");
        }
// getParameterNames()-retrieve an enumeration of parameter names present in the HTTP request
        Enumeration<String> parameterNames = req.getParameterNames();
// Enumeration- interface that provides a way to iterate through a collection of objects,
//              typically used in older Java APIs.
        resp.getWriter().println("<b>Details</b><br>");
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String paramValue = req.getParameter(paramName);
            resp.getWriter().println("<p>" + paramName + ":" + paramValue + "</p>");
        }

// getContentLength()-retrieve the length of the content body of an HTTP request.
//                   -size of the request payload in bytes
        int length = req.getContentLength();
        if(length>0){
        out.println("<p>Content Length: "+length+"</p>");
        }
        else{
            out.println("<p> No content.</p>");
        }

// getServerPort() -returns port number
        out.println("<b><i>SERVER PORT: "+req.getServerPort()+"</i></b>");

// getServername()- returns host name of the server
        out.println("<br><b><i>SERVER NAME: "+req.getServerName()+"</i></b>");

// getCharacterEncoding()- returns the set encoding request otherwise it shows null
        out.println("<br><b><i>CHARACTER ENCODING: "+req.getCharacterEncoding()+"</i></b>");
        String characterEncoding = req.getCharacterEncoding();

        if (characterEncoding != null && !characterEncoding.isEmpty()) {
            out.println("<br><b><i>Character Encoding: " + characterEncoding + "</i></b>");
        } else {
            out.println("<br><b><i>Character Encoding not specified.</i></b>");
        }
// getInputStream()-gets the information stream of the subprocess
//                 -stream gets information from the standard output stream
        out.println("<br><b><i>INPUT STREAM: "+req.getInputStream()+"</i></b>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        // getCharacterQueryString()-returns the req URL path
        out.println("<br><b><i>CHARACTER QUERY STRING: "+req.getQueryString()+"</i></b>");
        
    }

}

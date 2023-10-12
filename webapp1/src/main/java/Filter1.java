import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class Filter1 implements Filter {

    public void init(FilterConfig arg0) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {

        PrintWriter out = resp.getWriter();

        String password = req.getParameter("pass");

        if (password.equals("kgisl")) {
            chain.doFilter(req, resp);
        } else {
            out.print("error!");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
            requestDispatcher.include(req, resp);
        }

    }

    public void destroy() {
    }

}
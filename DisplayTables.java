import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DisplayTables extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> This is Santosh..</h1>");
        out.println("</body>");
        out.println("</html>");
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}

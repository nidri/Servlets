// Servlet class to show table.
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ShowTable extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      int Number = Integer.parseInt(req.getParameter("number"));
      //res.setContentType("text/html");
      PrintWriter out = res.getWriter();
      try {
        out.println("<!DOCTYPE html");  // HTML 5
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>")
        out.println("<head><title>" + "Multiplication Table"+ "</title></head>");
        out.println("<body>");
        out.println("<h1>" + "Table for " + Number + "</h1>");
        out.println("<br /><br />");
        for(int i=1; i<=10; i++)
          {
              out.println(Number + " X " + i + " = " + Number*i);
          }
        out.println("</body></html>");
      }
      finally {
        out.close();
      }
      public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res) ;
      }
    }

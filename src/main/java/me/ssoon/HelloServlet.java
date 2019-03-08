package me.ssoon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("doGet");
    resp.getWriter().println("<html>");
    resp.getWriter().println("<head>");
    resp.getWriter().println("</head>");
    resp.getWriter().println("<body>");
    resp.getWriter().println("<h1>Hello Servlet</h1");
    resp.getWriter().println("</body>");
    resp.getWriter().println("</html>");
  }

  @Override
  public void destroy() {
    System.out.println("destory");
  }

  @Override
  public void init() throws ServletException {
    System.out.println("init");
  }
}
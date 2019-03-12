package me.ssoon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("doGet");
    
    final ApplicationContext context = (ApplicationContext) getServletContext()
        .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
    final HelloService helloService = context.getBean(HelloService.class);
    resp.getWriter().println("<html>");
    resp.getWriter().println("<head>");
    resp.getWriter().println("</head>");
    resp.getWriter().println("<body>");
    resp.getWriter().println("<h1>Hello, " + helloService.getName() + "</h1>");
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

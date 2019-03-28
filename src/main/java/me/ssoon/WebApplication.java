package me.ssoon;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplication implements WebApplicationInitializer {

  @Override
  public void onStartup(final ServletContext servletContext) throws ServletException {
    final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.setServletContext(servletContext);
    context.register(WebConfig.class);
    context.refresh();

    final DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
    final Dynamic app = servletContext.addServlet("app", dispatcherServlet);
    app.addMapping("/app/*");
  }
}

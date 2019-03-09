package me.ssoon;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

  @Override
  public void contextInitialized(final ServletContextEvent sce) {
    System.out.println("Context Initialized");
    sce.getServletContext().setAttribute("name", "soohoon");
  }

  @Override
  public void contextDestroyed(final ServletContextEvent sce) {
    System.out.println("Context Destroyed");
  }
}

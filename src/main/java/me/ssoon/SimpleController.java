package me.ssoon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller("/simple")
public class SimpleController implements Controller {

  @Override
  public ModelAndView handleRequest(final HttpServletRequest httpServletRequest,
      final HttpServletResponse httpServletResponse) throws Exception {
    return new ModelAndView("simple");
  }
}

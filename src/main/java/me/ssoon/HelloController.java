package me.ssoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  private final HelloService helloService;

  public HelloController(final HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello, " + helloService.getName();
  }

  @GetMapping("/sample")
  public String sample() {
    return "sample";
  }
}

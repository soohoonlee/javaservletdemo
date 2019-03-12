package me.ssoon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService helloService;

  public HelloController(final HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello, " + helloService.getName();
  }
}

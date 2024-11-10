package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */

@RestController
public class HelloController {

  /**
   * @return
   */
  @GetMapping("/")
  public String index() {
    return "Hello World";
  }
}

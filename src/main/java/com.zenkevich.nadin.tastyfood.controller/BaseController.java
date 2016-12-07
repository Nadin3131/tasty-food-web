package com.zenkevich.nadin.tastyfood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nadin on 12/7/16.
 */
@Controller
@RequestMapping("/base")
public class BaseController {
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String test() {
    return "Hello, World!";
  }
}

package com.zenkevich.nadin.tastyfood.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private final static Logger logger = LoggerFactory.getLogger(BaseController.class);

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String test() {
    logger.debug("Base Controller Test Method");
    return "Hello, World!";
  }
}

package com.github.jiahut.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping,RequestMethod}



@Controller
@RequestMapping(Array("/"))
class HomeController {

  @RequestMapping(method = Array(RequestMethod.GET))
  def index(model: Model) = {
    model.addAttribute("title", "scala plus spring4")
    "index"
  }

}

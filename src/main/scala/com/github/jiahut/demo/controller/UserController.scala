package com.github.jiahut.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping,RequestMethod}

import com.github.jiahut.demo.domain._
import com.github.jiahut.demo.service._

@Controller
@RequestMapping(Array("/users"))
class UserController @Autowired() (userService: UserRepository) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def index(model: Model) = {
    model.addAttribute("users", userService.findAll)
    "users/list"
  }
}

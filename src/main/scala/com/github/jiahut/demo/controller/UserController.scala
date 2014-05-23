package com.github.jiahut.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping,RequestMethod}
import com.github.jiahut.demo.service.User
import com.github.jiahut.demo.service.UserService

@Controller
@RequestMapping(Array("/users"))
class UserController @Autowired() (userService: UserService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def index(model: Model) = {
    model.addAttribute("users", userService.findAllUsers.toArray)
    "users/list"
  }
}
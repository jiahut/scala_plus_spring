package com.github.jiahut.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping,RequestMethod}

import com.github.jiahut.demo.domain._
import com.github.jiahut.demo.repository._
import com.github.jiahut.demo.utils._

import org.slf4j.Logger

@Controller
@RequestMapping(Array("/users"))
class UserController @Autowired() (userService: UserRepository) {
  @InjectLogger
  var logger: Logger = _

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def index(model: Model) = {
    logger.info("access users")
    model.addAttribute("users", userService.findAll)
    "users/list"
  }
}

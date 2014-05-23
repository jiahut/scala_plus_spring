package com.github.jiahut.demo.service

import org.springframework.stereotype.Service


class User(var name: String,var age: Integer)
{
//	override def toString():String = {
//	  name + ":" + age
//	}
	def desc = name + ":" + age
}

trait CURDService[T] {
  def findAllUsers: List[T]
}

@Service
class UserService extends CURDService[User] {
  def findAllUsers = List(
      new User("jiahut",24),
      new User("beibei",23)
	)
}

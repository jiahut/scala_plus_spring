package com.github.jiahut.demo.domain

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity
import scala.beans.BeanProperty


@Entity
class User {
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var sex: Boolean = _

  def desc = {
    val the_sex =  sex match {
        case true => "女"
        case _  => "男"
      }
     name + the_sex
  }
}

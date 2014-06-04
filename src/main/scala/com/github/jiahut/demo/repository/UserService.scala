package com.github.jiahut.demo.repository

import org.springframework.data.repository.CrudRepository
import java.lang.Long

import com.github.jiahut.demo.domain._

trait UserRepository extends CrudRepository[User, Long]

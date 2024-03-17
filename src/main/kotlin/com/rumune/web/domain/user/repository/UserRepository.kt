package com.rumune.web.domain.user.repository

import com.rumune.web.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

interface UserRepository: JpaRepository<User,Long> {
    fun findByUserId(userId:Long):List<User>
    fun findByEmail(email:String):List<User>
    fun findByProviderId(providerId:String):List<User>
}
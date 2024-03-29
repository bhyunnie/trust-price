package com.rumune.web.domain.cart.repository

import com.rumune.web.domain.cart.entity.Cart
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CartRepository: JpaRepository<Cart,Long> {
    fun findByUserId(userId: Long): List<Cart>
}
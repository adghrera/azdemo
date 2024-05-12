package com.aman.demoapps.azdemo.extensions

import com.aman.demoapps.azdemo.entities.Article
import com.aman.demoapps.azdemo.entities.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}
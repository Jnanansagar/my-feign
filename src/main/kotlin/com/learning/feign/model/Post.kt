package com.learning.feign.model

data class Post(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String,
)
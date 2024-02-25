package com.learning.feign.controller

import com.learning.feign.model.Post
import com.learning.feign.service.PostsService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PostsController(
    val postsService: PostsService,
) {
    private val log = LoggerFactory.getLogger(PostsController::class.java)

    @GetMapping("/posts")
    private fun posts(): ResponseEntity<List<Post>> {
        return ResponseEntity.ok(postsService.getAllPosts())
    }

    @GetMapping("/posts/{postId}")
    private fun posts(@PathVariable("postId") postId: Long): ResponseEntity<Post> {
        log.info("received request with postId {}", postId)
        return ResponseEntity.ok(postsService.getPostById(postId))
    }
}
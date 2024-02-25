package com.learning.feign.external

import com.learning.feign.model.Post
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "external-service",
    url = "\${external.service.dummy.url}"
)
interface PostServiceClient {

    @GetMapping("/posts", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun getAllPosts(): List<Post>

    @GetMapping("/posts/{postId}", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun getPostById(@PathVariable("postId") postId: Long): Post

}
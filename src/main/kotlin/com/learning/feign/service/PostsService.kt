package com.learning.feign.service

import com.learning.feign.external.PostServiceClient
import com.learning.feign.model.Post
import io.micrometer.observation.ObservationRegistry
import org.springframework.stereotype.Service

@Service
class PostsService(
    val postServiceClient: PostServiceClient,
    val observationRegistry: ObservationRegistry,
) {

    fun getAllPosts(): List<Post> {
        return postServiceClient.getAllPosts()
    }

    fun getPostById(id: Long): Post {
        return postServiceClient.getPostById(id)
    }
}
package com.example.subject_service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://jsonplaceholder.typicode.com", value = "Post")
public interface MyClient {

    @GetMapping("/posts/1")
    Object getPost();

}

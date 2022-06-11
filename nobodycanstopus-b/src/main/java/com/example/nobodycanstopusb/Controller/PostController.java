package com.example.nobodycanstopusb.Controller;

import com.example.nobodycanstopusb.Model.Post;
import com.example.nobodycanstopusb.dto.PostRequestsDto;
import com.example.nobodycanstopusb.repository.PostRepository;
import com.example.nobodycanstopusb.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {


    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestsDto requestsDto) {
        return postService.create(requestsDto);
    }
}

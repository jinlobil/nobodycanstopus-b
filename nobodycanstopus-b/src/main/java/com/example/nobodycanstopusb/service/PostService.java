package com.example.nobodycanstopusb.service;


import com.example.nobodycanstopusb.Model.Post;
import com.example.nobodycanstopusb.dto.PostRequestsDto;
import com.example.nobodycanstopusb.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public Post create(PostRequestsDto requestsDto) {
      Post post = new Post(requestsDto);
      return postRepository.save(post);


    }
}

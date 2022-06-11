package com.example.nobodycanstopusb.service;

import com.sparta.teamproject6.domain.Post;
import com.sparta.teamproject6.dto.PostRequestsDto;
import com.sparta.teamproject6.repository.PostRepository;
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

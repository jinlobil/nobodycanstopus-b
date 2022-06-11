package com.example.nobodycanstopusb.repository;

import com.sparta.teamproject6.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainRepository extends JpaRepository<Post, Long> {
    //뭘 가져와야하나?
    List<Post> findAll();
}

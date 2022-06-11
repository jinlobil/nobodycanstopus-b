package com.example.nobodycanstopusb.repository;



import com.example.nobodycanstopusb.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
        List<Post> findAllByModifiedAtBetweenOrderByModifiedAtDesc (LocalDateTime start, LocalDateTime end);
    }

package com.example.nobodycanstopusb.repository;

import com.example.nobodycanstopusb.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment save(Comment comment);
}

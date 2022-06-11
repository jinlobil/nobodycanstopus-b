package com.example.nobodycanstopusb.Model;

import com.example.nobodycanstopusb.dto.PostRequestsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본 생성자 만듬.
@Getter // 조회를 하기 위해 있어야 됨.
@Entity // 테이블과 연계됨을 스프링에게 알려줌
public class Post {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id //고유 아이디
    private Long id;

    @Column(nullable = false)
    private String username;
    // 제목
    @Column(nullable = false)
    private String title;

    // 이미지
    @Column
    private String image;

    // 작성글
    @Column
    private String content;

    public Post(PostRequestsDto requestsDto) {
        this.username = requestsDto.getUsername();
        this.title = requestsDto.getTitle();
        this.content = requestsDto.getContent();
        this.image = requestsDto.getImage();
    }
}

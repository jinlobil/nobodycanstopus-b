package com.example.nobodycanstopusb.Model;

import com.example.nobodycanstopusb.dto.UserRequestDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor // 기본 생성자 만듬.
@Getter // 조회를 하기 위해 있어야 됨.
@Entity
public class User extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNumber;

    @JsonBackReference
    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Post> postList = new ArrayList<>();


    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    public User(Long userNumber, String username, String nickname, String password) {
        this.userNumber = userNumber;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    public User(UserRequestDto requestDto) {

        this.userNumber = requestDto.getUserNumber();
        this.nickname = requestDto.getUsername();
        this.nickname = requestDto.getNickname();
        this.password = requestDto.getPassword();
    }

    public void update(UserRequestDto requestDto) {

        this.userNumber = requestDto.getUserNumber();
        this.nickname = requestDto.getUsername();
        this.nickname = requestDto.getNickname();
        this.password = requestDto.getPassword();
    }
}

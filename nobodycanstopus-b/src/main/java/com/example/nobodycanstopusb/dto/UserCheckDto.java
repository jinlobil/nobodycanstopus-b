package com.example.nobodycanstopusb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCheckDto {

    private String username;
    private String nickname;
    private Long userId;
    private boolean check;


    public UserCheckDto(String username,String nickname, Long userId, boolean check) {
        this.username = username;
        this.nickname = nickname;
        this.userId = userId;
        this.check = check;
    }
}

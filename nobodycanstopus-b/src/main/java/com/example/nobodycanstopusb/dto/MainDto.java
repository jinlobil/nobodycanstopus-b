package com.example.nobodycanstopusb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MainDto {
    //유저 이름
   private String username;
   //게시글 제목
   private String title;
   //게시글 사진
   private String image;
   // 작성 시간
   private String modifiedAt;
}

package com.gjw.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {
    private int uid;
    private String acc;
    private String pwd;
    private String phone;
    private String email;

    public UserInfo(String acc, String pwd){
        this.acc = acc;
        this.pwd = pwd;
    }

}

package com.gjw.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminInfo {
    private int aid;
    private String acc;
    private String pwd;

    public AdminInfo(String acc, String pwd) {
        this.acc = acc;
        this.pwd = pwd;
    }

}

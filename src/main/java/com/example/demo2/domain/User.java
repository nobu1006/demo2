package com.example.demo2.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

    private String name;
    private String comment;
    private LocalDateTime postedAt;

    private static final DateTimeFormatter POST_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分秒");

    public User(String name, String comment) {
        this.name = name;
        this.comment = comment;
        this.postedAt = LocalDateTime.now();
    }

    public String getPostedAtStr() {
        return postedAt.format(POST_DATE_FORMAT);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "preferences")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private int level;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Column(name = "user_id")
    Long userId;

//    Table preferences {
//        id integer [primary key]
//        user_id int [ref: > users.id]
//        type string [note: "(ex: aventura, cultura, gastronomia)"]
//        level int [note: '(ex: 1 - baixo, 5 - alto)']
//        created_at timestamp
//    }
}

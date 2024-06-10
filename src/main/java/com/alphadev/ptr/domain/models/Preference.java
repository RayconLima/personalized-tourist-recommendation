package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "preferences")
public class Preference extends BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

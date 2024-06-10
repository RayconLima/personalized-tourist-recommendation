package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "interests")
public class Interest extends BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;

    public Long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

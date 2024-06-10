package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {
    private int level;
    @Column(name = "user_id")
    Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

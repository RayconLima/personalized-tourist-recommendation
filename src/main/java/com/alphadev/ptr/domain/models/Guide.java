package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "guides")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    Long userId;
    private Double total_cost;
    private Double total_duration;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(Double total_cost) {
        this.total_cost = total_cost;
    }

    public Double getTotal_duration() {
        return total_duration;
    }

    public void setTotal_duration(Double total_duration) {
        this.total_duration = total_duration;
    }
}

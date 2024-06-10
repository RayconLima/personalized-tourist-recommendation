package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "transportations")
public class Transportation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origin_id")
    Long originId;

    @Column(name = "destination_id")
    Long destinationId;

    private String type;
    private int duration_time;
    private Double cost;

    public Long getId() {
        return id;
    }

    public Long getOriginId() {
        return originId;
    }

    public void setOriginId(Long originId) {
        this.originId = originId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration_time() {
        return duration_time;
    }

    public void setDuration_time(int duration_time) {
        this.duration_time = duration_time;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}

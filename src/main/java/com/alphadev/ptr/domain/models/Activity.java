package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "destination_id")
    Long destinationId;

    private String label;
    private String description;
    private String type;
    private Double cost;
    private int time_duration;

    public Long getId() {
        return id;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getTime_duration() {
        return time_duration;
    }

    public void setTime_duration(int time_duration) {
        this.time_duration = time_duration;
    }
}

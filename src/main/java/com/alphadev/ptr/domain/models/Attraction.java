package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;

@Entity(name = "attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "guide_id")
    Long guideId;
    @Column(name = "destination_id")
    Long destinationId;
    private String name;
    private String type;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description = null;
    private int average_time_visit;
    private Double average_cost_visit;

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }



    public Long getId() {
        return id;
    }

    public Long getGuideId() {
        return guideId;
    }

    public void setGuideId(Long guideId) {
        this.guideId = guideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAverage_time_visit() {
        return average_time_visit;
    }

    public void setAverage_time_visit(int average_time_visit) {
        this.average_time_visit = average_time_visit;
    }

    public Double getAverage_cost_visit() {
        return average_cost_visit;
    }

    public void setAverage_cost_visit(Double average_cost_visit) {
        this.average_cost_visit = average_cost_visit;
    }
//    destiny_id int [ref: > destinations.id]
//    guide_id int [ref: > guides.id]
//    name string
//    description string
//    type string [note: "museu, restaurante, parque"]
//    average_time_visit int
//    average_cost_visit float
}

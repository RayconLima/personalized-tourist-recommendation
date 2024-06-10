package com.alphadev.ptr.domain.models;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import org.springframework.data.geo.Point;

@Entity(name = "destinations")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private String type;
    private String description;

//    @Column(columnDefinition = "point")
//    private Point location;

    public Long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Point getLocation(Point location) {
//        return location;
//    }
//
//    public void setLocation(Point location) {
//        this.location = location;
//    }
}

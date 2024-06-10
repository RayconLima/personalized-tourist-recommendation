package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.TransportationService;
import com.alphadev.ptr.domain.models.Transportation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/transportations")
public class TransportationController {
    private final TransportationService transportationService;

    public TransportationController(TransportationService transportationService) {
        this.transportationService = transportationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transportation> findById(@PathVariable Long id) {
        var transportation = transportationService.findById(id);
        return ResponseEntity.ok(transportation);
    }

    @PostMapping
    public ResponseEntity<Transportation> create(@RequestBody Transportation transportationToCreate) {
        var transportationCreated = transportationService.create(transportationToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(transportationCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(transportationCreated);
    }

}

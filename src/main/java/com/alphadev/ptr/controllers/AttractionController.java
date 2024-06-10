package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.AttractionService;
import com.alphadev.ptr.domain.models.Attraction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/attractions")
public class AttractionController {
    private final AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attraction> findById(@PathVariable Long id) {
        var attraction = attractionService.findById(id);
        return ResponseEntity.ok(attraction);
    }

    @PostMapping
    public ResponseEntity<Attraction> create(@RequestBody Attraction attractionToCreate) {
        var attractionCreated = attractionService.create(attractionToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(attractionCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(attractionCreated);
    }
}

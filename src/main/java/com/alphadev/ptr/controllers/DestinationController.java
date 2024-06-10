package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.DestinationService;
import com.alphadev.ptr.domain.models.Destination;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
    private final DestinationService destinationService;

    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destination> findById(@PathVariable Long id) {
        var destination = destinationService.findById(id);
        return ResponseEntity.ok(destination);
    }

    @PostMapping
    public ResponseEntity<Destination> create(@RequestBody Destination destinationToCreate) {
        var destinationCreated = destinationService.create(destinationToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(destinationCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(destinationCreated);
    }
}

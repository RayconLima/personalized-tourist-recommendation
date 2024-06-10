package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.InterestService;
import com.alphadev.ptr.domain.models.Interest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/interests")
public class InterestController {
    private final InterestService interestService;

    public InterestController(InterestService interestService) {
        this.interestService = interestService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Interest> findById(@PathVariable Long id) {
        var interest = interestService.findById(id);
        return ResponseEntity.ok(interest);
    }

    @PostMapping
    public ResponseEntity<Interest> create(@RequestBody Interest interestToCreate) {
        var interestCreated = interestService.create(interestToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(interestCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(interestCreated);
    }
}

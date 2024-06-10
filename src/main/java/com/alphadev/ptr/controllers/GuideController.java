package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.GuideService;
import com.alphadev.ptr.domain.models.Guide;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/guides")
public class GuideController {
    private final GuideService guideService;

    public GuideController(GuideService guideService) {
        this.guideService = guideService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guide> findById(@PathVariable Long id) {
        var guide = guideService.findById(id);
        return ResponseEntity.ok(guide);
    }

    @PostMapping
    public ResponseEntity<Guide> create(@RequestBody Guide guideToCreate) {
        var guideCreated = guideService.create(guideToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(guideCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(guideCreated);
    }
}

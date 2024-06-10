package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.PreferenceService;
import com.alphadev.ptr.domain.models.Preference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/preferences")
public class PreferenceController {
    private final PreferenceService preferenceService;

    public PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Preference> findById(@PathVariable Long id) {
        var preference = preferenceService.findById(id);
        return ResponseEntity.ok(preference);
    }

    @PostMapping
    public ResponseEntity<Preference> create(@RequestBody Preference preferenceToCreate) {
        var preferenceCreated = preferenceService.create(preferenceToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(preferenceCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(preferenceCreated);
    }
}

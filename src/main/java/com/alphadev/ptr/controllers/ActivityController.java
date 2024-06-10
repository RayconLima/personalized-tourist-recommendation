package com.alphadev.ptr.controllers;

import com.alphadev.ptr.Services.ActivityService;
import com.alphadev.ptr.domain.models.Activity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activity> findById(@PathVariable Long id) {
        var activity = activityService.findById(id);
        return ResponseEntity.ok(activity);
    }

    @PostMapping
    public ResponseEntity<Activity> create(@RequestBody Activity activityToCreate) {
        var activityCreated = activityService.create(activityToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(activityCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(activityCreated);
    }
}

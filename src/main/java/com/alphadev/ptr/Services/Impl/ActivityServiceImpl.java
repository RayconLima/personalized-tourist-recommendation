package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.ActivityService;
import com.alphadev.ptr.domain.models.Activity;
import com.alphadev.ptr.domain.models.Activity;
import com.alphadev.ptr.domain.repositories.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ActivityServiceImpl implements ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Activity findById(Long id) {
        return activityRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Activity create(Activity activityToCreate) {
        return activityRepository.save(activityToCreate);
    }
}

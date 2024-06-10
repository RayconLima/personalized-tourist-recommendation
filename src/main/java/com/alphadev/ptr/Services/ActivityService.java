package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Activity;

public interface ActivityService {
    Activity findById(Long id);

    Activity create(Activity activityToCreate);
}

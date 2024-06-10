package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Preference;

public interface PreferenceService {
    Preference findById(Long id);

    Preference create(Preference preferenceToCreate);
}

package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.PreferenceService;
import com.alphadev.ptr.domain.models.Preference;
import com.alphadev.ptr.domain.repositories.PreferenceRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PreferenceServiceImpl implements PreferenceService {
    private final PreferenceRepository preferenceRepository;

    public PreferenceServiceImpl(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    @Override
    public Preference findById(Long id) {
        return preferenceRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Preference create(Preference preferenceToCreate) {
        return preferenceRepository.save(preferenceToCreate);
    }
}

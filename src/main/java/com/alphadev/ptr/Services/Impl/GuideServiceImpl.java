package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.GuideService;
import com.alphadev.ptr.domain.models.Guide;
import com.alphadev.ptr.domain.repositories.GuideRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class GuideServiceImpl implements GuideService {
    private final GuideRepository guideRepository;

    public GuideServiceImpl(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }
    
    @Override
    public Guide findById(Long id) {
        return guideRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Guide create(Guide guideToCreate) {
        return guideRepository.save(guideToCreate);
    }
}

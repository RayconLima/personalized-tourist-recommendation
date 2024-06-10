package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.AttractionService;
import com.alphadev.ptr.domain.models.Attraction;
import com.alphadev.ptr.domain.models.Attraction;
import com.alphadev.ptr.domain.repositories.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AttractionServiceImpl implements AttractionService {
    private final AttractionRepository attractionRepository;

    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public Attraction findById(Long id) {
        return attractionRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Attraction create(Attraction attractionToCreate) {
        return attractionRepository.save(attractionToCreate);
    }
}

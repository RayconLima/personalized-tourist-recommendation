package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Attraction;

public interface AttractionService {
    Attraction findById(Long id);

    Attraction create(Attraction attractionToCreate);
}

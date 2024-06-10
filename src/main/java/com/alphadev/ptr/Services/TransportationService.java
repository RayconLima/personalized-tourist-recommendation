package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Transportation;

public interface TransportationService {
    Transportation findById(Long id);

    Transportation create(Transportation transportationToCreate);
}

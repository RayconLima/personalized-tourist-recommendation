package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Destination;

public interface DestinationService {
    Destination findById(Long id);

    Destination create(Destination destinationToCreate);
}

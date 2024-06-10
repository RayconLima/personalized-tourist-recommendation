package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.DestinationService;
import com.alphadev.ptr.domain.models.Destination;
import com.alphadev.ptr.domain.repositories.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DestinationServiceImpl implements DestinationService {
    private final DestinationRepository destinationRepository;

    public DestinationServiceImpl(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public Destination findById(Long id) {
        return destinationRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Destination create(Destination destinationToCreate) {
        return destinationRepository.save(destinationToCreate);
    }
}

package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.TransportationService;
import com.alphadev.ptr.domain.models.Transportation;
import com.alphadev.ptr.domain.repositories.TransportationRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TransportationServiceImpl implements TransportationService {
    private final TransportationRepository transportationRepository;

    public TransportationServiceImpl(TransportationRepository transportationRepository) {
        this.transportationRepository = transportationRepository;
    }

    @Override
    public Transportation findById(Long id) {
        return transportationRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Transportation create(Transportation transportationToCreate) {
        return transportationRepository.save(transportationToCreate);
    }
}

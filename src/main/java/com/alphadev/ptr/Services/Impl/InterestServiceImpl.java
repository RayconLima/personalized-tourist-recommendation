package com.alphadev.ptr.Services.Impl;

import com.alphadev.ptr.Services.InterestService;
import com.alphadev.ptr.domain.models.Interest;
import com.alphadev.ptr.domain.repositories.InterestRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class InterestServiceImpl implements InterestService {
    private final InterestRepository interestRepository;

    public InterestServiceImpl(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    @Override
    public Interest findById(Long id) {
        return interestRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Interest create(Interest interestToCreate) {
        return interestRepository.save(interestToCreate);
    }
}

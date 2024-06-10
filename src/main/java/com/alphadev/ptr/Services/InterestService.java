package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Interest;

public interface InterestService {
    Interest findById(Long id);

    Interest create(Interest interestToCreate);
}

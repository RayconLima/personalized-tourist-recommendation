package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.Guide;

public interface GuideService {
    Guide findById(Long id);

    Guide create(Guide guideToCreate);
}

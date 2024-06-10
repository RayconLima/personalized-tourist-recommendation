package com.alphadev.ptr.domain.repositories;

import com.alphadev.ptr.domain.models.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepository extends JpaRepository<Guide, Long> {
}

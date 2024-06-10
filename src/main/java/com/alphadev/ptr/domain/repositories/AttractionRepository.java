package com.alphadev.ptr.domain.repositories;

import com.alphadev.ptr.domain.models.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
}

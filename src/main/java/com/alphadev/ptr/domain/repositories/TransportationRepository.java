package com.alphadev.ptr.domain.repositories;

import com.alphadev.ptr.domain.models.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportationRepository extends JpaRepository<Transportation, Long> {
}

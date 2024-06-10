package com.alphadev.ptr.domain.repositories;

import com.alphadev.ptr.domain.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}

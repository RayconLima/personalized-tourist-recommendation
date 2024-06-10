package com.alphadev.ptr.domain.repositories;

import com.alphadev.ptr.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //
}

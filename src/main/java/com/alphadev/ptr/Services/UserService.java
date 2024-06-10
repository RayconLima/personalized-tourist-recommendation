package com.alphadev.ptr.Services;

import com.alphadev.ptr.domain.models.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}

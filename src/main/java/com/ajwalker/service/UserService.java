package com.ajwalker.service;

import com.ajwalker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    final UserRepository userRepository;
}

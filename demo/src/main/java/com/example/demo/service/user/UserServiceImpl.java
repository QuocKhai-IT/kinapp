package com.example.demo.service.user;

import com.example.demo.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.user.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Không hiểu là e muốn hỏi chi, nhưng ri là xong rồi :v
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

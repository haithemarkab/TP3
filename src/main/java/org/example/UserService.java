package org.example;


public class UserService {
    private UserRepository userRepository;
    public User getUserById(long id) {
        return userRepository.findUserById(id);
    }
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
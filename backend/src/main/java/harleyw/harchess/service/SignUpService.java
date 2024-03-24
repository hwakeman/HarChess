package harleyw.harchess.service;

import harleyw.harchess.model.User;
import harleyw.harchess.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
    UserRepository userRepository;
    PasswordEncoder userPasswordEncoder;

    public SignUpService(UserRepository userRepository, PasswordEncoder userPasswordEncoder) {
        this.userRepository = userRepository;
        this.userPasswordEncoder = userPasswordEncoder;
    }

    public boolean signUpUser(User user) {
        if(userRepository.findByUsername(user.getUsername()) != null) {
            return false;
        } else {
            String hashedPassword = userPasswordEncoder.encode(user.getPassword());
            userRepository.addUser(user.getUsername(), hashedPassword, user.getRating());
            return true;
        }
    }
}

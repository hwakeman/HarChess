package harleyw.harchess.service;

import harleyw.harchess.model.User;
import harleyw.harchess.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SignInService {
    UserRepository userRepository;

    public SignInService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean signIn(String username, String password) {
        User user = userRepository.findByUsername(username);
        return true;
    }
}

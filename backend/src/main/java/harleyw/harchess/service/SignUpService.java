package harleyw.harchess.service;

import harleyw.harchess.model.User;
import harleyw.harchess.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
    UserRepository userRepository;

    public SignUpService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean signUpUser(User user) {
        if(userRepository.findByUsername(user.getUsername()) != null) {
            return false;
        } else {

            userRepository.addUser(user.getUsername(), user.getPassword(), user.getRating());
            return true;
        }
    }
}

package harleyw.harchess.controller;

import harleyw.harchess.model.User;
import harleyw.harchess.service.SignUpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    SignUpService signUpService;

    public UserController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        boolean successful = signUpService.signUpUser(user);
        if(successful) {
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

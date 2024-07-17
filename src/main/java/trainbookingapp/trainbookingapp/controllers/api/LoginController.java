package trainbookingapp.trainbookingapp.controllers;

import java.lang.Iterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.entity.User;
import trainbookingapp.trainbookingapp.repository.UserRepository;

class LoginResponse {

  public String message;
  public String status;
}

@RestController
@RequestMapping("/api")
public class LoginController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping(path = "/login")
  public LoginResponse login(
    @RequestParam String username,
    @RequestParam String password
  ) {
    Iterable<User> iterator = userRepository.findAll();

    for (User user : iterator) {
      if (
        user.getUsername().equals(username) &&
        user.getPassword().equals(password)
      ) {
        LoginResponse response = new LoginResponse();
        response.message = "Login Successful";
        response.status = "200";
        return response;
      }
    }
    LoginResponse response = new LoginResponse();
    response.message = "Usernaem or Password is incorrect";
    response.status = "400";
    return response;
  }
}

package trainbookingapp.trainbookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.entity.User;
import trainbookingapp.trainbookingapp.repository.UserRepository;

class RegisterResponse {

  public String message;
  public String status;
}

@RestController
@RequestMapping("/api")
public class RegiserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping(path = "/register")
  public RegisterResponse login(@ModelAttribute User user) {
    userRepository.save(user);
    RegisterResponse response = new RegisterResponse();
    response.message = "Registration Successful";
    response.status = "success";
    return response;
  }
}

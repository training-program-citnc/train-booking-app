package trainbookingapp.trainbookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import trainbookingapp.trainbookingapp.entity.User;
import trainbookingapp.trainbookingapp.repository.UserRepository;

@Controller
public class MainController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/")
  public String main() {
    User newUser = new User();
    newUser.setAadhar("123456789012");
    newUser.setFirstName("John");
    newUser.setEmail("john.deo@gmail.com");

    userRepository.save(newUser);

    return "main-page.html";
  }
}

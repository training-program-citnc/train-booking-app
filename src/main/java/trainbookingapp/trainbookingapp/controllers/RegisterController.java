package trainbookingapp.trainbookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import trainbookingapp.trainbookingapp.entity.User;
import trainbookingapp.trainbookingapp.repository.UserRepository;

@Controller
public class RegisterController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("user", new User());
    return "user-register-page.html";
  }
  // @PostMapping("/register")
  // public String register(@ModelAttribute User user) {
  //   userRepository.save(user);
  //   return "redirect:/register?success=true";
  // }
}

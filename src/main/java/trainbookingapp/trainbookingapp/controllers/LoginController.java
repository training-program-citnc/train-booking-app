package trainbookingapp.trainbookingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import trainbookingapp.trainbookingapp.entity.User;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String login(Model model) {
    User user = new User();
    model.addAttribute("user", user);

    return "user-login-page.html";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute User user, Model model) {
    String username = user.getUsername();
    String password = user.getPassword();

    String ADMIN_USERNAME = "admin";
    String ADMIN_PASSWORD = "password";

    if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
      return "redirect:/admin-dashboard";
    } else {
      return "redirect:/login?error=true";
    }
  }
}

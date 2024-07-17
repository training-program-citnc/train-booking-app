package trainbookingapp.trainbookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class LoginResponse {

  public String message;
  public String status;
}

@RestController
@RequestMapping("/api")
public class LoginController {

  @GetMapping(path = "/login")
  public LoginResponse login(
    @RequestParam String username,
    @RequestParam String password
  ) {
    String ADMIN_USERNAME = "admin";
    String ADMIN_PASSWORD = "password";

    if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
      LoginResponse response = new LoginResponse();
      response.message = "Login Successful";
      response.status = "Authenticated";
      return response;
    } else {
      LoginResponse response = new LoginResponse();
      response.message = "Login Failed";
      response.status = "Unauthenticated";
      return response;
    }
  }
}

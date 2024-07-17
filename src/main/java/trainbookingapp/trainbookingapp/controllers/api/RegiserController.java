package trainbookingapp.trainbookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.entity.User;
import trainbookingapp.trainbookingapp.repository.UserRepository;

// QUERY
// http://localhost:8080/api/register?username=dusklight00&firstName=dusk&lastName=light&email=r.rahul.developer@gmail.com&mobileNumber=999&address=boston&city=bangalore&state=karnataka&password=password&aadhar=999&pincode=123&gender=male

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
    response.status = "200";
    return response;
  }
}

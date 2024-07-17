package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MailController {

  @GetMapping("/send-mail")
  public String sendEmail(
    @RequestParam String email,
    @RequestParam String subject,
    @RequestParam String message
  ) {
    return "working";
  }
}

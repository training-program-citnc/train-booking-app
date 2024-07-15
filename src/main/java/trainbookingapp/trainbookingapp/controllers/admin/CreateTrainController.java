package trainbookingapp.trainbookingapp.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateTrainController {

  @GetMapping("/create-train")
  public String main() {
    return "create-train-page.html";
  }
}

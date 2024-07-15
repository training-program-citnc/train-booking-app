package trainbookingapp.trainbookingapp.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeleteTrainController {

  @GetMapping("/delete-train")
  public String main() {
    return "delete-train-page.html";
  }
}

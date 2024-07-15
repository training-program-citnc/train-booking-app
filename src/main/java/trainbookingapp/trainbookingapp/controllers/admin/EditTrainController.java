package trainbookingapp.trainbookingapp.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditTrainController {

  @GetMapping("/edit-train")
  public String main() {
    return "edit-train-page.html";
  }
}

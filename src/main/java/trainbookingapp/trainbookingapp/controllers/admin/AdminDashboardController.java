package trainbookingapp.trainbookingapp.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDashboardController {

  @GetMapping("/admin-dashboard")
  public String main() {
    return "admin-dashboard-page.html";
  }
}

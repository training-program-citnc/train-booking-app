package trainbookingapp.trainbookingapp.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBookedTicketController {

  @GetMapping("/view-booked-ticket")
  public String main() {
    return "view-booked-ticket-page.html";
  }
}

package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Ticket;
import trainbookingapp.trainbookingapp.repository.TicketRepository;

@RestController
@RequestMapping("/api")
public class TicketController {

  @Autowired
  private TicketRepository ticketRepository;

  // QUERY
  // http://localhost:8080/api/create-ticket?pnr=123&trainId=123&paymentMethod=netbanking&amount=2500&passengerEmail=r.rahul.developer@gmail.com&passengerMobileNumber=8002030975
  @GetMapping("/create-ticket")
  public Response createTicket(@ModelAttribute Ticket ticket) {
    ticketRepository.save(ticket);
    Response response = new Response();
    response.message = "Ticket Created Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/all-ticket")
  public Iterable<Ticket> allTicket() {
    Iterable<Ticket> iterable = ticketRepository.findAll();
    return iterable;
  }
}

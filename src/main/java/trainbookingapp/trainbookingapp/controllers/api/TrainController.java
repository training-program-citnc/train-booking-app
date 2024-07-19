package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Train;
import trainbookingapp.trainbookingapp.repository.TrainRepository;

@RestController
@RequestMapping("/api")
public class TrainController {

  @Autowired
  private TrainRepository trainRepository;

  // QUERY
  // http://localhost:8080/api/create-train?trainName=dusky_train&trainNumber=212&source=patna&destination=bangalore&date=17-07-2024&time=23:41
  @GetMapping("/create-train")
  public Response createTrain(@ModelAttribute Train train) {
    trainRepository.save(train);
    Response response = new Response();
    response.message = "Train Created Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/edit-train")
  public Response editTrain(@RequestParam Train train) {
    trainRepository.save(train);
    Response response = new Response();
    response.message = "Train Edited Successfully";
    response.status = 200;
    return response;
  }

  // QUERY
  // http://localhost:8080/api/delete-train?trainId=212
  @GetMapping("/delete-train")
  public Response deleteTrain(@RequestParam String trainId) {
    trainRepository.deleteById(trainId);
    Response response = new Response();
    response.message = "Train Deleted Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/all-trains")
  public Iterable<Train> allTrains() {
    return trainRepository.findAll();
  }

  @GetMapping("/search-ticket")
  public Iterable<Train> searchTicket(
    @RequestParam String source,
    @RequestParam String destination,
    @RequestParam String date
  ) {
    return trainRepository.findAllBySourceAndDestinationAndDate(
      source,
      destination,
      date
    );
  }
}

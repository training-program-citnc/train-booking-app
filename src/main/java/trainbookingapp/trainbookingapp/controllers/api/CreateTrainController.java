package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Train;
import trainbookingapp.trainbookingapp.repository.TrainRepository;

@RestController
@RequestMapping("/api")
public class CreateTrainController {

  @Autowired
  private TrainRepository trainRepository;

  @GetMapping("/create-train")
  public Response createTrain(@ModelAttribute Train train) {
    trainRepository.save(train);
    Response response = new Response();
    response.message = "Train Created Successfully";
    response.status = 200;
    return response;
  }
}

package trainbookingapp.trainbookingapp.controllers.admin;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateTrainController {

  @GetMapping("/create-train")
  public String main() {
    return "create-train-page.html";
  }

  private String trainName,trainId,from,to;
  private LocalDate date;
  private LocalTime time;

  public String getTrainName() {
    return trainName;
  }

  public void setTrainName(String trainName) {
    this.trainName = trainName;
  }

  public String getTrainId() {
    return trainId;
  }

  public void setTrainId(String trainId) {
    this.trainId = trainId;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }


  

}

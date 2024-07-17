package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Train {

  @Id
  private String train_number;

  private String train_name;
  private String source;
  private String destination;
  private String departure_date;
  private String departure_time;

  public String getTrainNumber() {
    return train_number;
  }

  public void setTrainNumber(String trainNumber) {
    this.train_number = trainNumber;
  }

  public String getTrainName() {
    return train_name;
  }

  public void setTrainName(String trainName) {
    this.train_name = trainName;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  // TODO : these String can be parsed into Date using SimpleDateFormat

  public String getDepartureDate() {
    return departure_date;
  }

  public void setDepartureDate(String departure_date) {
    this.departure_date = departure_date;
  }

  public String getDepartureTime() {
    return departure_time;
  }

  public void setDepartureTime(String departure_time) {
    this.departure_time = departure_time;
  }
}

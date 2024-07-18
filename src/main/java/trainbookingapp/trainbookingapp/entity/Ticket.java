package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

  @Id
  String pnr;

  String train_name;
  String train_id;
  String date;
  String source;
  String destination;
  String time;

  public String getPNR() {
    return pnr;
  }

  public void setPNR(String pnr) {
    this.pnr = pnr;
  }

  public String getTrainId() {
    return train_id;
  }

  public void setTrainId(String train_id) {
    this.train_id = train_id;
  }

  public String getTrainName() {
    return train_name;
  }

  public void setTrainName(String train_name) {
    this.train_name = train_name;
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

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}

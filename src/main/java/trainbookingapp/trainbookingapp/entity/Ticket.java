package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

  @Id
  String pnr;

  String movie_id;
  String method;
  int amount;
  String email;
  String audience_mobile_number;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public String getMovieId() {
    return movie_id;
  }

  public void setMovieId(String movie_id) {
    this.movie_id = movie_id;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAudienceMobileNumber() {
    return audience_mobile_number;
  }

  public void setAudienceMobileNumber(String audience_mobile_number) {
    this.audience_mobile_number = audience_mobile_number;
  }
}

package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserTicket {

  @Id
  String pnr;

  String aadhar_card;

  public String getPNR() {
    return pnr;
  }

  public void setPNR(String pnr) {
    this.pnr = pnr;
  }

  public String getAadhar() {
    return aadhar_card;
  }

  public void setAadhar(String aadhar_card) {
    this.aadhar_card = aadhar_card;
  }
}

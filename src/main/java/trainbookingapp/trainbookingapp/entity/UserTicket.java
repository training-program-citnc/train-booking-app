package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserTicket {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer userTicketId;

  String pnr;

  String name;
  int age;
  String gender;
  String preference;
  String class;
  String price;
  String seatNumber;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public String getAadhar() {
    return aadhar;
  }

  public void setAadhar(String aadhar) {
    this.aadhar = aadhar;
  }
}

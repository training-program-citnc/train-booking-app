package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

  @Id
  String pnr;

  String train_id;
  String payment_method;
  int amount;
  String passenger_email;
  String passenger_mobile_number;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public String getTrainId() {
    return train_id;
  }

  public void setTrainId(String train_id) {
    this.train_id = train_id;
  }

  public String getPaymentMethod() {
    return payment_method;
  }

  public void setPaymentMethod(String payment_method) {
    this.payment_method = payment_method;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getPassengerEmail() {
    return passenger_email;
  }

  public void setPassengerEmail(String passenger_email) {
    this.passenger_email = passenger_email;
  }

  public String getPassengerMobileNumber() {
    return passenger_mobile_number;
  }

  public void setPassengerMobileNumber(String passenger_mobile_number) {
    this.passenger_mobile_number = passenger_mobile_number;
  }
}

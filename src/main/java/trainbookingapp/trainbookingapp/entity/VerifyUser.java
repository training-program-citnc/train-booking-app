package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VerifyUser {

  @Id
  private String email_id;

  private String otp;

  public String getEmail() {
    return email_id;
  }

  public void setEmail(String email) {
    this.email_id = email;
  }

  public String getOtp() {
    return otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }
}

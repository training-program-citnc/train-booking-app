package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

  @Id
  private String aadhar_card;

  private String username, first_name, last_name, email_id, mobile_number, address, city, state, password;

  private int pincode;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFirstName() {
    return first_name;
  }

  public void setFirstName(String firstName) {
    this.first_name = firstName;
  }

  public String getLastName() {
    return last_name;
  }

  public void setLastName(String lastName) {
    this.last_name = lastName;
  }

  public String getAadhar() {
    return aadhar_card;
  }

  public void setAadhar(String aadhar_card) {
    this.aadhar_card = aadhar_card;
  }

  public String getEmail() {
    return email_id;
  }

  public void setEmail(String email) {
    this.email_id = email;
  }

  public String getMobileNumber() {
    return mobile_number;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobile_number = mobileNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

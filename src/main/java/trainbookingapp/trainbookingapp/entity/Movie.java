package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {

  @Id
  private String movie_number;

  private String movie_name;
  private String location;
  private String date;
  private String time;

  public String getMovieNumber() {
    return movie_number;
  }

  public void setMovieNumber(String movieNumber) {
    this.movie_number = movieNumber;
  }

  public String getMovieName() {
    return movie_name;
  }

  public void setMovieName(String movieName) {
    this.movie_name = movieName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  // TODO : these String can be parsed into Date using SimpleDateFormat

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

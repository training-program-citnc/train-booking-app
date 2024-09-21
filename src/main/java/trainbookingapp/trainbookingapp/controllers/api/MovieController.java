package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Movie;
import trainbookingapp.trainbookingapp.repository.MovieRepository;

@RestController
@RequestMapping("/api")
public class MovieController {

  @Autowired
  private MovieRepository movieRepository;

  // QUERY
  // http://localhost:8080/api/create-train?trainName=dusky_train&trainNumber=212&source=patna&destination=bangalore&date=17-07-2024&time=23:41
  @GetMapping("/create-movie")
  public Response createTrain(@ModelAttribute Movie movie) {
    movieRepository.save(movie);
    Response response = new Response();
    response.message = "Movie Created Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/edit-movie")
  public Response editTrain(@ModelAttribute Movie movie) {
    String trainId = movie.getMovieNumber();

    if (movieRepository.existsById(trainId)) {
      Movie existingTrain = movieRepository.findById(trainId).get();
      if (movie.getMovieName() != null) {
        existingTrain.setMovieName(movie.getMovieName());
      }
      if (movie.getLocation() != null) {
        existingTrain.setLocation(movie.getLocation());
      }
      if (movie.getDate() != null) {
        existingTrain.setDate(movie.getDate());
      }
      if (movie.getTime() != null) {
        existingTrain.setTime(movie.getTime());
      }

      movieRepository.save(existingTrain);
      Response response = new Response();
      response.message = "Movie Edited Successfully";
      response.status = 200;
      return response;
    } else {
      Response response = new Response();
      response.message = "Movie Not Found";
      response.status = 404;
      return response;
    }
  }

  // QUERY
  // http://localhost:8080/api/delete-train?trainId=212
  @GetMapping("/delete-movie")
  public Response deleteTrain(@RequestParam String movieId) {
    movieRepository.deleteById(movieId);
    Response response = new Response();
    response.message = "Train Deleted Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/all-movie")
  public Iterable<Movie> allTrains() {
    return movieRepository.findAll();
  }

  @GetMapping("/search-movie-by-id")
  public Movie searchTrainById(@RequestParam String movieId) {
    return movieRepository.findById(movieId).get();
  }

  @GetMapping("/search-movie")
  public Iterable<Movie> searchTicket(
    @RequestParam String location,
    @RequestParam String date
  ) {
    // return trainRepository.findAll();
    return movieRepository.findAllByLocationAndDate(location, date);
  }
}

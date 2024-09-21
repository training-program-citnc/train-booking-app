package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {
  public Iterable<Movie> findAllByLocationAndDate(String location, String date);
}

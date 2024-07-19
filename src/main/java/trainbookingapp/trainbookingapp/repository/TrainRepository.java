package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.Train;

public interface TrainRepository extends CrudRepository<Train, String> {
  public Iterable<Train> findAllBySourceAndDestinationAndDate(
    String source,
    String destination,
    String date
  );
}

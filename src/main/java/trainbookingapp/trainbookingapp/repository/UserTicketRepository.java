package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.UserTicket;

public interface UserTicketRepository
  extends CrudRepository<UserTicket, Integer> {
  public Iterable<UserTicket> findAllByAadhar(String aadhar);
}

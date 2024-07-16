package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.User;

public interface UserRepository extends CrudRepository<User, String> {}

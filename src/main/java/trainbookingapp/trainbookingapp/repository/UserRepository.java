package trainbookingapp.trainbookingapp.repository;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.User;

public interface UserRepository extends CrudRepository<User, BigInteger> {}

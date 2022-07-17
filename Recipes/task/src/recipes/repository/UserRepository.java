package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import recipes.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}

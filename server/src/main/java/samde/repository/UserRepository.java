package samde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samde.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}

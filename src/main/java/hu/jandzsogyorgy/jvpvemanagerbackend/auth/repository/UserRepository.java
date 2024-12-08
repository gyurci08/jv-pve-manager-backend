package hu.jandzsogyorgy.jvpvemanagerbackend.auth.repository;

import hu.jandzsogyorgy.jvpvemanagerbackend.auth.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

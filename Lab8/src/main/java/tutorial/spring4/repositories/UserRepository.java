package tutorial.spring4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tutorial.spring4.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

	public List<User> findByUsername(String username);

	public List<User> findByUsernameAndPassword(String username, String password);

}

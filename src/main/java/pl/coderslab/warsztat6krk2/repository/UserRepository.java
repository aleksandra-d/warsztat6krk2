package pl.coderslab.warsztat6krk2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.warsztat6krk2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmail(String email);

}

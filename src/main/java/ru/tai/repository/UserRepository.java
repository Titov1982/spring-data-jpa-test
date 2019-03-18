package ru.tai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tai.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}

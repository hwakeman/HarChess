package harleyw.harchess.repository;

import harleyw.harchess.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user (username, password, rating) VALUES (:username, :password, :rating)", nativeQuery = true)
    void addUser(@Param("username") String username, @Param("password") String password, @Param("rating") double rating);
}

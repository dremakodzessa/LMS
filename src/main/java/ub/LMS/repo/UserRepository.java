package ub.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ub.LMS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

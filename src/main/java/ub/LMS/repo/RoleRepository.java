package ub.LMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ub.LMS.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}

package cr.ac.cenfotec.ejemplo1.repository;

import cr.ac.cenfotec.ejemplo1.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}

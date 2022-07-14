package cl.mycompany.movielibraryapi.repository;

import cl.mycompany.movielibraryapi.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}

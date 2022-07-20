package cl.mycompany.movielibraryapi.repository;

import cl.mycompany.movielibraryapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

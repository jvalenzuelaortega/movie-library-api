package cl.mycompany.movielibraryapi.controller;

import cl.mycompany.movielibraryapi.entity.Movie;
import cl.mycompany.movielibraryapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/list-movies")
    public ResponseEntity<List<Movie>> getResponseListMovies() {
        return new ResponseEntity<>(movieService.getListMovies(), HttpStatus.OK);
    }
}

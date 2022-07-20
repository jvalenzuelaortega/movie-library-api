package cl.mycompany.movielibraryapi.service.impl;

import cl.mycompany.movielibraryapi.entity.Movie;
import cl.mycompany.movielibraryapi.repository.MovieRepository;
import cl.mycompany.movielibraryapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getListMovies() {
        return movieRepository.findAll();
    }
}

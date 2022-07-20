package cl.mycompany.movielibraryapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieid")
    private Long movieId;

    @Column(name = "moviename")
    private String movieName;

    public Movie() {
    }

    public Movie(Long movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}

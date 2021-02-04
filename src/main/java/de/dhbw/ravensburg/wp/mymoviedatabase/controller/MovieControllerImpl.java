package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.model.Movie;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieControllerImpl implements MovieController {

    private MovieService movieService;

    public MovieControllerImpl(MovieService movieService){
        this.movieService = movieService;
    }


    @Override
    @GetMapping
    public List<Movie> getAllMovies(){
        return this.movieService.getAllMovies();
    }

    @Override
    @DeleteMapping("/{movieId}")
    public void deleteMovie(@PathVariable("movieId") Long movieId){
        this.movieService.removeById(movieId);
    }

    @Override
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return this.movieService.addMovie(movie);
    }

    @Override
    @PutMapping("/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") Long movieId, @RequestBody Movie movie){
        movie.setId(movieId);
        return this.movieService.updateMovie(movie);
    }


}
/*

@RestController
@RequestMapping("/api/v1/awards")
public class AwardControllerImpl implements AwardController {

    private AwardService awardService;

    public AwardControllerImpl(AwardService awardService){
        this.awardService = awardService;
    }



    @Override
    @GetMapping
    public List<Award> getAllAwards(){ return this.awardService.getAllAwards();}


    @Override
    @DeleteMapping("/{awardId}")
    public void deleteAward(@PathVariable("awardId") Long awardId){
        this.awardService.removeById(awardId);
    }

    @Override
    @PostMapping
    public Award addAward(@RequestBody Award award){
        return this.awardService.addAward(award);
    }

    @Override
    @PutMapping("/{awardId}")
    public Award updateAward(@PathVariable("awardId") Long awardId, @RequestBody Award award){
        award.setId(awardId);
        return this.awardService.updateAward(award);
    }

}
 */
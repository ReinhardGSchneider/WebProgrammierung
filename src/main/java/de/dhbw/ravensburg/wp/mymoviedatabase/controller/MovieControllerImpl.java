package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.ArtistService;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.ArtistServiceImpl;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieControllerImpl implements MovieController {

    @Autowired
    private  MovieServiceImpl movieService;

    @Autowired
    private ArtistServiceImpl artistService;

    public MovieControllerImpl(MovieServiceImpl movieService, ArtistServiceImpl artistService){

        this.movieService = movieService;
        this.artistService = artistService;
    }


    public String getName(){return "MovieControllerImpl";}

    public String getServiceName(){
        return movieService.getName();
    }

    public String getArtistName(){
        return artistService.getName();
    }


}

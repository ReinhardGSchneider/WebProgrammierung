package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.ArtistServiceImpl;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieControllerImpl {

    @Autowired
    private MovieServiceImpl movieService;



    ArtistServiceImpl artistService;


    public String getName(){

        return "MovieControllerImpl";
    }

    /*@Autowired
    public String getServiceName(){

    }*/


}

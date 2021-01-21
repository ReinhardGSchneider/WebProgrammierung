package de.dhbw.ravensburg.wp.mymoviedatabase;

import de.dhbw.ravensburg.wp.mymoviedatabase.controller.GreetingController;
import de.dhbw.ravensburg.wp.mymoviedatabase.controller.MovieControllerImpl;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ManualTestBean {
    // Vorsicht diese Klasse ist nur für Übungszwecke,
    // sie sollte nie in einer produktiven Applikation sein

    @Autowired
    MovieControllerImpl movieController;

    @Autowired
    GreetingServiceImpl greetingService;



    ManualTestBean(MovieControllerImpl movieController, GreetingServiceImpl greetingService){

        this.movieController = movieController;
        this.greetingService = greetingService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void callController(){
        log.info(greetingService.personalizeGreeting("Spiderman","de"));
    }



}

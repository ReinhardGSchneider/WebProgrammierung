package de.dhbw.ravensburg.wp.mymoviedatabase.service;


import ch.qos.logback.core.CoreConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceImplTest {


    @Autowired
    private GreetingServiceImpl greetingService;

    public GreetingServiceImplTest(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }
    String name = "Batman";
    String language = "de";

    @Test
    public void shouldpersonalizeGreeting(String name, String language)
    {
        String s = greetingService.personalizeGreeting(name, language);
        System.out.println(s+"Hier bist du richtig" +
                "also gut");
    }



    @Test
    public void shouldpersonalizeGreeting1(String name, String language)
    {

        String s = greetingService.personalizeGreeting(name, language);
        System.out.println(s+"Hier bist du richtig" +
                "also gut");
    }

}

package de.dhbw.ravensburg.wp.mymoviedatabase.controller;


import de.dhbw.ravensburg.wp.mymoviedatabase.service.GreetingService;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

public class GreetingControllerImplTest {

    @Autowired
    GreetingController greetingController;

    @MockBean
    GreetingService greetingService;

    @BeforeEach
    public void setUp(){
        Mockito.when(greetingService.personalizeGreeting(any(), any()))
                .thenReturn("Hallo Max Muster, herzl. willkommen");
    }

    @Test
    public  void shouldSuccessfullyReturnGreetingNormalCase(){
        String result = greetingController.personalizeGreeting("Max Muster", "de");
        verify(greetingService).personalizeGreeting(any(), any());
        assertTrue(result.equals("Hallo Max Muster, herzl. willkommen"));
    }

    @Test
    public void  shouldSuccessfullyReturnGreetingNoUsernameNoLanguage(){
        String result = greetingController.personalizeGreeting("","de");
        verify(greetingService).personalizeGreeting(eq("Max Mustermann"),any());
        assertTrue(result.equals("Hallo Max Muster, herzl. willkommen"));
    }


}

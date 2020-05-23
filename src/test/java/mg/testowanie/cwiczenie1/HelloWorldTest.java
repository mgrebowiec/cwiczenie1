package mg.testowanie.cwiczenie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    private HelloWorld helloWorld;

    @BeforeEach
    private void init() {
        helloWorld = new HelloWorld();
    }

    @Test
    void shouldReturnGreetingMessageForGivenName() {
        //given
        String name = "Michal";

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertEquals("Hello Michal!", greeting);
    }

    @Test
    void shouldReturnGreetingMessageForNullName() {
        //given
        String name = null;

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertEquals("Hello! You don't have a name!", greeting);
    }

    @Test
    void shouldReturnGreetingMessageForEmptyName() {
        //given
        String name = "";

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertEquals("Hello! You don't have a name!", greeting);
    }

    @Test
    void shouldReturnGreetingMessageForBlankName() {
        //given
        String name = " ";

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertEquals("Hello! You don't have a name!", greeting);
    }
}
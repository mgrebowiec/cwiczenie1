package mg.testowanie.cwiczenie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldAssertJTest {

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
        assertThat(greeting)
                .isEqualTo("Hello %s!", "Michal");
    }

    @Test
    void shouldReturnGreetingMessageForNullName() {
        //given
        String name = null;

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello! You don't have a name!");
    }

    @Test
    void shouldReturnGreetingMessageForEmptyName() {
        //given
        String name = "";

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello! You don't have a name!");
    }

    @Test
    void shouldReturnGreetingMessageForBlankName() {
        //given
        String name = " ";

        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello! You don't have a name!");
    }
}

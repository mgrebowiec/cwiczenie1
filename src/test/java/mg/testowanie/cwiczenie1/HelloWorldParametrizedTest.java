package mg.testowanie.cwiczenie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldParametrizedTest {

    private HelloWorld helloWorld;

    @BeforeEach
    private void init() {
        helloWorld = new HelloWorld();
    }

    @ParameterizedTest
    @CsvSource({"jan", "michal"})
    void shouldReturnGreetingMessageForGivenName(String name) {
        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello %s!", name);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnDefaultGreetingMessageForNotDefinedName(String name) {
        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello! You don't have a name!");
    }

    @ParameterizedTest
    @MethodSource("notDefineNames")
    @NullSource
    void shouldReturnDefaultGreetingMessageForNotDefinedName2(String name) {
        //when
        String greeting = helloWorld.greeting(name);

        //then
        assertThat(greeting)
                .isEqualTo("Hello! You don't have a name!");
    }

    static Stream notDefineNames() {
        return Stream.of(
                Arguments.of(""),
                Arguments.of(" "),
                Arguments.of("   "),
                Arguments.of("\t")
        );
    }
}

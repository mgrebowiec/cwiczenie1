package mg.testowanie.cwiczenie1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilTest {

    @ParameterizedTest
    @MethodSource("numbersToDivideAndExpectedResults")
    void shouldDivideNumbers(int a, int b, int expectedResult) {
        //when
        int actual = NumberUtil.divide(a, b);
        //then
        assertThat(actual)
                .isEqualTo(expectedResult);
    }

    static Stream numbersToDivideAndExpectedResults() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(0, 1, 0),
                Arguments.of(1, 2, 0),
                Arguments.of(1, 0, 0),
                Arguments.of(5, 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersAndExpectedGreaterValues")
    void shouldReturnNumbersGreaterThanSpecified(int[] numbers, int specifiedValue, int[] expectedNumbers) {
        //when
        int[] actualNumbers = NumberUtil.getNumbersGreaterThan(numbers, specifiedValue);
        //then
        assertThat(actualNumbers)
                .containsExactlyInAnyOrder(expectedNumbers);
    }

    static Stream numbersAndExpectedGreaterValues() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 3, new int[]{}),
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{3}),
                Arguments.of(new int[]{}, 3, new int[]{}),
                Arguments.of(new int[]{-1, 2, 3}, -2, new int[]{-1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("numbersAndExpectedEvenNumbers")
    void shouldReturnEvenNumbers(int[] numbers, int[] expectedEvenNumbers) {
        //when
        int[] actualNumbers = NumberUtil.getEvenNumbers(numbers);
        //then
        assertThat(actualNumbers)
                .isNotNull()
                .containsExactlyInAnyOrder(expectedEvenNumbers);
    }

    static Stream numbersAndExpectedEvenNumbers() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{2,4}),
                Arguments.of(new int[]{1,3,5}, new int[]{}),
                Arguments.of(new int[]{2,6}, new int[]{2,6}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }

}
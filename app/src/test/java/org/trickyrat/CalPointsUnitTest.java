package org.trickyrat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalPointsUnitTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("getData")
    public void test(String[] ops, int expected) {
        int actual = solution.calPoints(ops);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.arguments(new String[]{"5","2","C","D","+"}, 30),
                Arguments.arguments(new String[]{"5","-2","4","C","D","9","+","+"}, 27),
                Arguments.arguments(new String[]{"1"}, 1));
    }
}

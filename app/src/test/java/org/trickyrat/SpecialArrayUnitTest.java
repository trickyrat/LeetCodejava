package org.trickyrat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SpecialArrayUnitTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("getData")
    public void test(int[] nums, int expected) {
        var actual = solution.specialArray(nums);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 5}, 2),
                Arguments.arguments(new int[]{0, 0}, -1),
                Arguments.arguments(new int[]{0, 4, 3, 0, 4}, 3)
        );
    }
}
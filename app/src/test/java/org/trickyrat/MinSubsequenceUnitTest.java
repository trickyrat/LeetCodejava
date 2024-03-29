package org.trickyrat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MinSubsequenceUnitTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("getData")
    public void test(int[] input, List<Integer> expected) {
        List<Integer> actual = solution.minSubsequence(input);
        Assertions.assertIterableEquals(expected, actual);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.arguments(new int[]{4, 3, 10, 9, 8}, Arrays.asList(10, 9)),
                Arguments.arguments(new int[]{4, 4, 7, 6, 7}, Arrays.asList(7, 7, 6)),
                Arguments.arguments(new int[]{6}, Arrays.asList(6)));
    }
}

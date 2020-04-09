package hackerrank.submissions.resolvers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EqualStacksTest {

    private EqualStacks equalStacks;

    @BeforeEach
    void init() {
        equalStacks = new EqualStacks();
    }

    @ParameterizedTest
    @MethodSource("provideStacksForValidateMaxHeight")
    void shouldReturnMaxHeightForAllStacks(int[][] stacks, int expectedMaxHeight) {
        final int actualMaxHeight = equalStacks.solve(stacks);
        Assertions.assertEquals(expectedMaxHeight, actualMaxHeight);
    }

    private static Stream<Arguments> provideStacksForValidateMaxHeight() {
        return Stream.of(
                Arguments.of(new int[][]{
                        new int[]{3, 2, 1, 1, 1},
                        new int[]{4, 3, 2},
                        new int[]{1, 1, 4, 1}
                }, 5)
        );
    }
}

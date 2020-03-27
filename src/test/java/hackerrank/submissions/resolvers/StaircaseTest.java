package hackerrank.submissions.resolvers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

/**
 * With this way is easy to define mocks, stub objects, etc. but our tests will be bound to the framework,
 * @see EqualStacksTest for another way (manually)
 */
@ExtendWith(MockitoExtension.class)
public class StaircaseTest {

    @InjectMocks
    private Staircase staircase;

    @ParameterizedTest
    @MethodSource("provideStairsForAnStaircase")
    void shouldPrintStaircaseWithNStairs(int stairs, String expectedStaircase) {
        final String actualStaircase = staircase.solve(stairs);
        Assertions.assertEquals(expectedStaircase, actualStaircase);
    }

    private static Stream<Arguments> provideStairsForAnStaircase() {
        return Stream.of(
                Arguments.of(1, "#\n"),
                Arguments.of(2, " #\n##\n"),
                Arguments.of(3, "  #\n ##\n###\n"),
                Arguments.of(4, "   #\n  ##\n ###\n####\n"),
                Arguments.of(5, "    #\n   ##\n  ###\n ####\n#####\n")
        );
    }

}

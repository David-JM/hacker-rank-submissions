package hackerrank.submissions.resolvers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class BitsDetectorTest {

    @InjectMocks
    private BitsDetector bitsDetector;

    @ParameterizedTest
    @MethodSource("provideNumbersToCountBits")
    public void shouldBinary(int[] numbers, String expectedTotalBits) {
        final String actualTotalBits = bitsDetector.solve(numbers);
        Assertions.assertEquals(expectedTotalBits, actualTotalBits);
    }

    private static Stream<Arguments> provideNumbersToCountBits() {
        return Stream.of(
                Arguments.of(new int[]{7, 3}, "3")
        );
    }
}

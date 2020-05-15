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
public class MathematicalSerieTest {

    @InjectMocks
    private MathematicalSerie mathematicalSerie;

    @ParameterizedTest
    @MethodSource("provider")
    public void shouldBinary(int[] input, String expectedSerie) {
        final String actualSerie = mathematicalSerie.solve(input[0], input[1], input[2]);
        Assertions.assertEquals(expectedSerie, actualSerie);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 10}, "2,6,14,30,62,126,254,510,1022,2046")
        );
    }
}

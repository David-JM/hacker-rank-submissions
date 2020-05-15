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
public class BombDetectorTest {

    @InjectMocks
    private BombDetector bombDetector;

    @ParameterizedTest
    @MethodSource("provider")
    public void shouldBinary(String[][] input, int expectedBuildingsNotDestroyed) {
        final int actualBuildingsNotDestroyed = bombDetector.solve(input);
        Assertions.assertEquals(expectedBuildingsNotDestroyed, actualBuildingsNotDestroyed);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new String[][]{
                        new String[]{"2", "*", "*", "*", "E", "*"},
                        new String[]{"E", "*", "*", "*", "*", "*"},
                        new String[]{"*", "*", "*", "*", "*", "*"},
                        new String[]{"*", "*", "1", "*", "*", "*"},
                        new String[]{"*", "*", "*", "*", "E", "*"},
                        new String[]{"4", "*", "*", "*", "*", "E"}
                }, 2)
        );
    }
}

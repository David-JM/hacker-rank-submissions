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
public class MovementsTest {

    @InjectMocks
    private Movements movements;

    @ParameterizedTest
    @MethodSource("movimientos")
    public void prueba(int[] input, String expectedPrint) {
        final String actualPrint = movements.solve(input);
        Assertions.assertEquals(expectedPrint, actualPrint);
    }

    private static Stream<Arguments> movimientos() {
        return Stream.of(Arguments.of(new int[]{1, 2, -1, 1, 0, 1, 2, -1, -1, -2}, "0X00\n0000\n0000\n0000\n")
        );
    }
}

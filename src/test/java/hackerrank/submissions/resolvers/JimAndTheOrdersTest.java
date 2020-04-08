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
public class JimAndTheOrdersTest {

    @InjectMocks
    private JimAndTheOrders jimAndTheOrders;

    @ParameterizedTest
    @MethodSource("provideOrders")
    public void shouldPrintTheOrdersByServeTimeFromMinorToMajor(int[][] orders, String expectedOrdersAscending) {
        final String actualOrdersAscending = jimAndTheOrders.solve(orders);
        Assertions.assertEquals(expectedOrdersAscending, actualOrdersAscending);
    }

    private static Stream<Arguments> provideOrders() {
        return Stream.of(
                Arguments.of(new int[][]{
                        new int[]{8, 1},
                        new int[]{4, 2},
                        new int[]{5, 6},
                        new int[]{3, 1},
                        new int[]{4, 3}
                }, "[4, 2, 5, 1, 3]"),
                Arguments.of(new int[][]{
                        new int[]{1, 3},
                        new int[]{2, 3},
                        new int[]{3, 3}
                }, "[1, 2, 3]")
        );
    }
}

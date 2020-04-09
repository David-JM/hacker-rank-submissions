package hackerrank.submissions.resolvers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyungTimerTest {

    @InjectMocks
    private MyungTimer myungTimer;

    @ParameterizedTest
    @CsvSource({"7500,2h5m0s", "83643,23h14m3s", "2000,0h33m20s"})
    public void shouldGetHoursAndMinutesAndSeconds(String input, String expected) {
        String actualValue = myungTimer.solve(Integer.parseInt(input));
        Assertions.assertEquals(expected, actualValue);
    }
}

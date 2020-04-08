package hackerrank.submissions.resolvers;

import hackerrank.submissions.ProblemResolver;

import java.util.Arrays;

public class JimAndTheOrders implements ProblemResolver<int[][]> {
    public static final int MAX_POSSIBLE_SERVE_TIME = 2000001;
    public static final int ODER_NUMBER = 0;
    public static final int PREPARATION_TIME = 1;

    @Override
    public String solve(int[][] orders) {
        int[] serveTimes = new int[orders.length];
        for (int i = 0; i < orders.length; i++) {
            serveTimes[i] = orders[i][ODER_NUMBER] + orders[i][PREPARATION_TIME];
        }

        int[] ordersAscending = new int[serveTimes.length];

        for (int i = 0; i < serveTimes.length; i++) {
            int index = 0, lesser = serveTimes[0];
            for (int j = 1; j < serveTimes.length; j++) {
                if (serveTimes[j] < lesser) {
                    lesser = serveTimes[j];
                    index = j;
                }
            }
            ordersAscending[i] = index + 1;
            serveTimes[index] = MAX_POSSIBLE_SERVE_TIME;
        }
        return Arrays.toString(ordersAscending);
    }
}

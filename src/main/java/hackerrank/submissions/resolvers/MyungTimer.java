package hackerrank.submissions.resolvers;

import hackerrank.submissions.ProblemResolver;

public class MyungTimer implements ProblemResolver<Integer> {
    public static final int SECONDS_BY_HOUR = 3600;
    public static final int SECONDS_BY_MINUTE = 60;

    public static final String HOURS = "h";
    public static final String MINUTES = "m";
    public static final String SECONDS = "s";

    @Override
    public String solve(Integer time) {
        int remainingSeconds;
        StringBuilder timeConverted = new StringBuilder();

        timeConverted.append(time / SECONDS_BY_HOUR).append(HOURS);
        remainingSeconds = time % SECONDS_BY_HOUR;
        timeConverted.append(remainingSeconds / SECONDS_BY_MINUTE).append(MINUTES);
        timeConverted.append(remainingSeconds % SECONDS_BY_MINUTE).append(SECONDS);

        return timeConverted.toString();
    }
}

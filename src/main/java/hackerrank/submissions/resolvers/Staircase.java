package hackerrank.submissions.resolvers;

import hackerrank.submissions.ProblemResolver;

public class Staircase implements ProblemResolver<Integer> {

    public static final String STAIR_BLOCK = "#";
    public static final String SPACE = " ";
    public static final String NEW_LINE = "\n";

    @Override
    public String solve(Integer totalStairs) {
        StringBuilder stairBuilder = new StringBuilder();

        for (int i = 1; i <= totalStairs; i++) {
            for (int j = 1; j <= totalStairs; j++) {
                if ((totalStairs - j) < i) {
                    stairBuilder.append(STAIR_BLOCK);
                } else {
                    stairBuilder.append(SPACE);
                }
            }
            stairBuilder.append(NEW_LINE);
        }
        return stairBuilder.toString();
    }

}




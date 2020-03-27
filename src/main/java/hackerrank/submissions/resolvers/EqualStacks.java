package hackerrank.submissions.resolvers;

import hackerrank.submissions.ProblemResolver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualStacks implements ProblemResolver<int[][]> {

    public static final int INDEX_ZERO = 0;
    public static final int INDEX_ONE = 1;
    public static final int INDEX_TWO = 2;

    @Override
    public String solve(int[]... stacks) {
        final List<Integer> stack1 = Arrays.stream(stacks[INDEX_ZERO]).boxed().collect(Collectors.toList());
        final List<Integer> stack2 = Arrays.stream(stacks[INDEX_ONE]).boxed().collect(Collectors.toList());
        final List<Integer> stack3 = Arrays.stream(stacks[INDEX_TWO]).boxed().collect(Collectors.toList());

        int stackHeight1 = stack1.stream().mapToInt(Integer::intValue).sum();
        int stackHeight2 = stack2.stream().mapToInt(Integer::intValue).sum();
        int stackHeight3 = stack3.stream().mapToInt(Integer::intValue).sum();

        while (stackHeight1 != stackHeight2 || stackHeight1 != stackHeight3) {
            if (stackHeight1 > stackHeight2) {
                if (stackHeight1 > stackHeight3) {
                    stackHeight1 -= stack1.get(INDEX_ZERO);
                    stack1.remove(INDEX_ZERO);
                } else {
                    stackHeight3 -= stack3.get(INDEX_ZERO);
                    stack3.remove(INDEX_ZERO);
                }
            } else if (stackHeight2 > stackHeight3) {
                stackHeight2 -= stack2.get(INDEX_ZERO);
                stack2.remove(INDEX_ZERO);
            } else {
                stackHeight3 -= stack3.get(INDEX_ZERO);
                stack3.remove(INDEX_ZERO);
            }
        }
        return String.valueOf(stackHeight1);
    }
}

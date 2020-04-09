package hackerrank.submissions.resolvers;

import hackerrank.submissions.ProblemResolver;

import java.util.stream.Stream;

public class BitsDetector implements ProblemResolver<int[]> {
    public static final int BINARY_BASE = 2;
    public static final Integer ONE = 1;

    @Override
    public String solve(int... numbers) {
        int result = numbers[0] * numbers[1];
        int quotient = (result / BINARY_BASE), remainder = (result % BINARY_BASE);

        StringBuilder binaryRepresentation = new StringBuilder().append(remainder);

        while (quotient > ONE) {
            remainder = quotient % BINARY_BASE;
            quotient /= BINARY_BASE;
            binaryRepresentation.append(remainder);
        }
        final String binary = binaryRepresentation.append(quotient).reverse().toString();
        return countBits(binary).toString();
    }

    private Long countBits(String binaryNumber) {
        return Stream.of(binaryNumber.split("")).filter(bit -> bit.equals(ONE.toString())).count();
    }
}

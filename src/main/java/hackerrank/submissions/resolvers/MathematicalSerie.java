package hackerrank.submissions.resolvers;

public class MathematicalSerie {

    public String solve(int a, int b, int n) {
        int result = 0;
        final int firstConstantValue = a + (int) Math.pow(2, 0) * b;

        StringBuilder serie = new StringBuilder();
        serie.append(firstConstantValue);

        for (int i = 1; i < n; i++) {
            serie.append(",");
            for (int j = 1; j <= i; j++) {
                result += (int) Math.pow(2, j) * b;
            }
            serie.append(firstConstantValue + result);
            result = 0;
        }
        return serie.toString();
    }
}

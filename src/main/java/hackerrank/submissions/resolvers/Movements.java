package hackerrank.submissions.resolvers;

public class Movements {

    public String solve(int[] input) {
        int x = 0, y = 0, tmp = 0;
        for (int i = 0; i < input.length; i += 2) {
            tmp = x + input[i];
            x = tmp < 0 || tmp > 3 ? x : tmp;

            tmp = y + input[i + 1];
            y = tmp < 0 || tmp > 3 ? y : tmp;
        }

        String[][] emptyMatrix = new String[][]{
                new String[]{"0", "0", "0", "0"},
                new String[]{"0", "0", "0", "0"},
                new String[]{"0", "0", "0", "0"},
                new String[]{"0", "0", "0", "0"}
        };
        emptyMatrix[y][x] = "X";
        return printMatrix(emptyMatrix);
    }

    public static String printMatrix(String[][] matrix) {
        StringBuilder printedMatrix = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                printedMatrix.append(matrix[i][j]);
            }
            printedMatrix.append("\n");
        }
        return printedMatrix.toString();
    }
}

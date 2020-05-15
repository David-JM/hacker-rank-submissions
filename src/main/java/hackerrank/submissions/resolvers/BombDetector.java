package hackerrank.submissions.resolvers;

public class BombDetector {

    private static final String EDIFICIO = "E";
    private static final String ESPACIO_VACIO = "*";

    public int solve(String[][] mat) {
        int buildingsDestroyed = 0, totalBuildings = countTotalBuildings(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (!mat[i][j].equals(EDIFICIO) && !mat[i][j].equals(ESPACIO_VACIO)) {
                    buildingsDestroyed += calculateBuildingsDestroyed(mat, i, j);
                    // Finaliza iteraccion, no hay mas edificios por destruir
                    if(buildingsDestroyed == totalBuildings)
                        return 0;
                }
            }
        }
        return totalBuildings - buildingsDestroyed;
    }

    private int countTotalBuildings(String[][] mat) {
        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j].equals(EDIFICIO))
                    cont++;
            }
        }
        return cont;
    }

    private int calculateBuildingsDestroyed(String[][] mat, int row, int column) {
        final int radiousBomb = Integer.parseInt(mat[row][column]);

        int firstRow = (row - radiousBomb) < 0 ? 0 : (row - radiousBomb);
        int lastRow = (row + radiousBomb) > 6 ? 6 : (row + radiousBomb);
        int firstColumn = (column - radiousBomb) < 0 ? 0 : (column - radiousBomb);
        int lastColumn = (column + radiousBomb) > 6 ? 6 : (column + radiousBomb);

        int cont = 0;
        for (int i = firstRow; i < lastRow; i++) {
            for (int j = firstColumn; j < lastColumn; j++) {
                if (mat[i][j].equals(EDIFICIO))
                    cont++;
            }
        }
        return cont;
    }
}

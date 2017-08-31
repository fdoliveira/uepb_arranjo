public class ArranjoMultidimensional {

    public static void main(String[] args) {
        int[][][] dados;

        dados = new int[2][3][2];

        dados[0][0][0] = 3;
        dados[0][0][1] = 13;
        dados[0][1][0] = 2;
        dados[0][1][1] = 12;
        dados[0][2][0] = 1;
        dados[0][2][1] = 11;
        dados[1][0][0] = 2;
        dados[1][0][1] = 12;
        dados[1][1][0] = 6;
        dados[1][1][1] = 16;
        dados[1][2][0] = 7;
        dados[1][2][1] = 17;

        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                for (int k = 0; k < dados[i][j].length; k++) {
                    System.out.println("dados[" + i + "][" + j + "][" + k + "] = " + dados[i][j][k]);
                }
            }
        }
    }
}

public class ArranjoBidimensional {

    public static void main(String[] args) {
        int[][] dados;

        dados = new int[3][2];

        dados[0][0] = 3;
        dados[0][1] = 2;
        dados[1][0] = 1;
        dados[1][1] = 2;
        dados[2][0] = 6;
        dados[2][1] = 7;

        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                System.out.println("dados[" + i + "][" + j + "] = " + dados[i][j]);
            }
        }
    }
}

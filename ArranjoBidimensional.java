public class ArranjoBidimensional {

    public static void main(String[] args) {
        int[][] dados;

        dados = new int[2][3];

        dados[0][0] = 3;
        dados[0][1] = 2;
        dados[0][2] = 1;
        dados[1][0] = 2;
        dados[1][1] = 6;
        dados[1][2] = 7;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("dados[" + i + "][" + j + "] = " + dados[i][j]);
            }
        }
        
    }

}

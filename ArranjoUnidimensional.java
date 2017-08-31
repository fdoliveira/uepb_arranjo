public class ArranjoUnidimensional {

    public static void main(String[] args) {
        int[] dados;

        dados = new int[10];

        dados[0] = 3;
        dados[1] = 2;
        dados[2] = 1;
        dados[3] = 2;
        dados[4] = 6;
        dados[5] = 7;
        dados[6] = 9;
        dados[7] = 10;
        dados[8] = 3;
        dados[9] = 22;

        for (int i = 0; i < 10; i++) {
            System.out.println("dados[" + i + "] = " + dados[i]);
        }
        
    }

}

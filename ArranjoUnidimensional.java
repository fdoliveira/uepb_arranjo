public class ArranjoUnidimensional {

    public static void main(String[] args) {
        // Declaração do Array
        int[] dados;

        // Inicialização do Array
        dados = new int[10];

        // Acessando do Array
        dados[0] = 3;
        dados[1] = 2;
        dados[2] = 1;
        dados[3] = 2;
        dados[4] = 6;

        for (int i = 0; i < 5; i++) {
            System.out.println("dados[" + i + "] = " + dados[i]);
        }        
    }
}

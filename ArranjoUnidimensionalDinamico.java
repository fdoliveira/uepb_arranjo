import java.util.ArrayList;

public class ArranjoUnidimensionalDinamico {

    public static void main(String[] args) {
        // Declaração do Array
        ArrayList<Integer> dados;

        // Inicialização do Array
        dados = new ArrayList<Integer>();

        // Acessando do Array
        dados.add(2);
        dados.add(1);
        dados.add(2);
        dados.add(6);
        // Adicionando um elemento no topo do arranjo
        dados.add(0, 3);

        for (int i = 0; i < dados.size(); i++) {
            System.out.println("dados[" + i + "] = " + dados.get(i));
        }
    }
}

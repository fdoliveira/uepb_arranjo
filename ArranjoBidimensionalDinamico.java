import java.util.ArrayList;

class Dados {
    int x;
    int y;

    Dados(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ArranjoBidimensionalDinamico {

    public static void main(String[] args) {
        // Declaração do Array
        ArrayList<Dados> dados;

        // Inicialização do Array
        dados = new ArrayList<Dados>();

        // Acessando do Array
        dados.add(new Dados(1, 2));
        dados.add(new Dados(6, 7));
        // Adicionando um elemento no topo do arranjo
        dados.add(0, new Dados(3, 2));

        for (int i = 0; i < dados.size(); i++) {
            System.out.println("dados[x, y] = " + dados.get(i).x + ", " + dados.get(i).y);
        }
    }
}

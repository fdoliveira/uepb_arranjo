public class ExcecaoAcessoForLimite {
  
      public static void main(String[] args) {
          // Declaração do Array
          int[] dados;
  
          // Inicialização do Array
          dados = new int[5];
  
          // Acessando do Array
          dados[0] = 3;
          dados[1] = 2;
          dados[2] = 1;
          dados[3] = 2;
          dados[4] = 6;

          // Acesso fora do limite do arranjo
          dados[5] = 0;
  
          for (int i = 0; i < dados.length; i++) {
              System.out.println("dados[" + i + "] = " + dados[i]);
          }
      }
  }
  
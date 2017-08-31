import java.util.Scanner;

public class OrdenarTresValores {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o valor de A: ");
        int a = input.nextInt();
        
        System.out.print("Entre com o valor de B: ");
        int b = input.nextInt();
        
        System.out.print("Entre com o valor de C: ");
        int c = input.nextInt();

        System.out.println("");
        System.out.print("Os valores em ordem: ");

        if (a > b) {
            if (b > c) {
                System.out.printf("%s, %s, %s", c, b, a);
            } else {
                if (a > c) {
                    System.out.printf("%s, %s, %s", b, c, a);
                } else {
                    System.out.printf("%s, %s, %s", b, a, c);
                }
            }
        } else {
            if (a > c) {
                System.out.printf("%s, %s, %s", c, a, b);
            } else {
                if (b > c) {
                    System.out.printf("%s, %s, %s", a, c, b);
                } else {
                    System.out.printf("%s, %s, %s", a, b, c);
                }
            }            
        }

        System.out.println("");
        System.out.println("FIM");
    }
}
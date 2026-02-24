import java.util.Scanner;

public class OrdenandoPedidosDoUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros deseja colocar?");
        int QuantidadeDeNumeros = scanner.nextInt();

        int[] NumerosDoUsuario = new int[QuantidadeDeNumeros];

        for(int i = 0; i < QuantidadeDeNumeros; i++) {
            System.out.println("Digite o numero da posição " + (i + 1) + ":");
            NumerosDoUsuario[i] = scanner.nextInt();
        }

        for (int i = 0; i < NumerosDoUsuario.length; i++) {

            if (NumerosDoUsuario[i] % 2 == 0) {
                NumerosDoUsuario[i] = NumerosDoUsuario[i] * 2;

            } else {
                NumerosDoUsuario[i] = (int) Math.pow(NumerosDoUsuario[i], 2);
            }
        }

        System.out.print("Resultado: [");
        for (int i = 0; i < NumerosDoUsuario.length; i++) {
            System.out.print(NumerosDoUsuario[i]);

            if (i < NumerosDoUsuario.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
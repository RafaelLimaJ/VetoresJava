import java.util.Scanner;

public class InverterNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite oque deseja ver escrito ao-contrario:");
        String NomeDigitado = scanner.nextLine();
        char[] Nome = NomeDigitado.toCharArray();
        String NomeInvertido = "";
        for (int i = Nome.length-1; i >= 0;i--){
            char LetraAtual = Nome[i];
            NomeInvertido = NomeInvertido + LetraAtual;
        }
        System.out.println(NomeInvertido);
    }
}

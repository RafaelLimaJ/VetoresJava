
public class OrdenarEmOrdemCrescente {
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 23, 12, 312, 41, 24, 512, 57, 5, 1234123412, 3, 1345, 3, 65, 5};
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                int aux = vetor[i];
                if(vetor[i] > vetor[j]){
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
            System.out.println(vetor[i]);
        }
    }
}

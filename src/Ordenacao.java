import org.w3c.dom.ls.LSOutput;
//fazer entrada de um vetor inteiro c/ 5 posições
//fazer a ordenação simples do vetor
//imprimir o vetor na tela
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ordenacao {

    public static void main(String[] args) {
        int[] vetor = new int[5];
        int aux;
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite %dº número\n",i+1);
            vetor[i] = ler.nextInt();
        }
        //ordenacao de vetor simples
        for (int i = 0; i < 5; i++) { //n vezes
        for (int j = 0; j < 4; j++) { //n-1 vezes a troca
            if (vetor[j] > vetor[j + 1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
        }


        System.out.println("Vetor Odenado");
        for (int i = 0; i < 5; i++) {
            System.out.println("O vetor ficou: " + vetor[i]);
        }

    }
}

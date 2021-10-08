package ctcteste;

import java.util.Random;

public class CTCTeste2 {

    public static void main(String[] args) {
        /*Possuindo apenas uma estrutura de repetição aninhada e as demais simples. Pelo conceito Big O,
         ignorando as constantes e utilizando o termo de maior grau, a complexidade do algoritmo é O(N²)   */

        int k;
        Random random = new Random();
 
        //O valor da variável K é definido de forma aleatória limitada à 20 e atríbuído ao tamanho do vetor A
        k = random.nextInt(20);
        int a[] = new int[k];

        System.out.print("Vetor A: ");

        //Estrutura de repetição para captar de valores e adicionar às posições do vetor A também de forma aleatória com base na variável K
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = random.nextInt(k);
        }

        //Estrutura de repetição para imprimir os valores do vetor A
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Total de K: " + k);
        System.out.println(contagemParesComplementares(a, k));

    }

    /*A função percorre o vetor A de forma bidimensional. Ou seja, todas as combinações entre posições são somadas e caso alguma 
    delas resulte no valor de K, a variável local totalParesComplementares (que inicia em 0), adiciona mais 1 à sua contagem.*/
    public static String contagemParesComplementares(int a[], int k) {
        int totalPares = 0;
        String paresComplementares = "";
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    paresComplementares += ("(" + a[i] +"+" + a[j] + ")");
                    totalPares++;

                }
            }
        }
        return  "Total: "+totalPares + " | Pares: " + paresComplementares;
    }

}

package ctcteste;

import java.util.Scanner;

public class CTCTeste1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra, opcao, palindromo;

        
        System.out.println("Digite algum conteúdo: ");
        palavra = scan.nextLine();

        
        System.out.println("Contém espaços em branco?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scan.next();

        if (opcao.equals("1") || opcao.equalsIgnoreCase("sim")) {
            palavra = juntaPalavras(palavra);
        }

        
        System.out.println("Está tudo em minúsculo?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcao = scan.next();

        if (opcao.equals("2") || opcao.equalsIgnoreCase("não")) {
            palavra = convertePalavraEmMinusculo(palavra);
        }

        palindromo = invertePalavra(palavra);

        System.out.println(palindromo);
        System.out.println(palavra);
        verificaPalindromo(palavra, palindromo);
    }

    //A função substitui todos os espaços em branco da variável palavra por espaços prenchidos, retornando-as como uma sequência de letras sem espaço.  
    public static String juntaPalavras(String palavra) {
        String palavraSemEspaco = palavra.replace(" ", "");
        return palavraSemEspaco;
    }

    //Função para converter String maiúscula e retornar minúscula
    public static String convertePalavraEmMinusculo(String palavra) {
        return palavra.toLowerCase();
    }

    //A função percorre a variável palavra de trás pra frente e atribui o valor à variável palindromo. Retornando-a em seguida.
    public static String invertePalavra(String palavra) {
        String palindromo = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }
        return palindromo;
    }

    //O método compara as variáveis palavra e palindromo e vê se elas são iguais.
    public static void verificaPalindromo(String palavra, String palindromo) {
        if (palavra.equals(palindromo)) {
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }
    }
}

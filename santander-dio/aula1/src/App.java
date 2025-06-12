import java.util.Scanner;
//import java.time.LocalDate;
//import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
//escreva um codigo que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá, [nome] você tem x anos."
        /* 
        Scanner scanner = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + (anoAtual - anoNascimento) + " anos.");

        scanner.close();
        */

//Escreva um codigo que receba o tamanho do lado de um quadrado, cacula sua área e exiba na tela.
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado do quadrado? ");
        int ladoQuadrado = scanner.nextInt();

        System.out.println("A área do quadrado é: " + Math.pow(ladoQuadrado, 2));

        scanner.close();
        */

// Escreva um codigo que receba a base de um retângulo e calcula sua área e exiba na tela.
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a base do retangulo? ");
        int baseRetangulo = scanner.nextInt();

        System.out.println("Qual a altura do retangulo ");
        int alturaRetangulo = scanner.nextInt();

        System.out.println("A área do retangulo é: " + (baseRetangulo * alturaRetangulo));

        scanner.close();
        */

//Escreva um codigo que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.
        Scanner scanner = new Scanner(System.in);

        int[] idade = new int[2];
        String[] nomes = new String[2];
        int diferenca = 0;        

        for(int i = 0; i < 2; i++){
            System.out.printf("Qual o nome da %sª pessoa: ", i+1);
            nomes[i] = scanner.next();
            System.out.printf("Qual a idade da %sª pessoa: ", i+1);
            idade[i] = scanner.nextInt();

            if(i == 1){                
                if(idade[0] < idade[1]){
                    diferenca = idade[1] - idade[0];
                } else {
                    diferenca = idade[0] - idade[1];
                }                

                System.out.println("A difereça entre as idades é: " + diferenca);
            }
        }

        scanner.close();
    }
}

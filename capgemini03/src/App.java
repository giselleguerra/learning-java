import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crie um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 0){
                System.out.println("O número é zero");
            } else {
                if( numero > 0){
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            System.out.println("Deseja continuar? S - sim / N - não");
            desejaContinuar = scanner.next().charAt(0);
        }
    }
}

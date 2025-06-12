import java.util.Scanner;
import java.lang.Math;


public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        //EXERCICIO 01 - Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
        /*
        //usuário entra com o número
        System.out.println("Digite um número: ");
        var numero = scanner.nextInt();
        
        //imprime tabuada
        for(var i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
        */
        

        //EXERCICIO 02 - Ecreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC e seja exibida a mensagem de acordo com o resultado: * Se for menor ou igual a 18,5 "Abaixo do peso" * Se for entre 18,6 e 24,9 "Peso Ideal" * Se for entre 25,0 e 29,9 "Levemente acima do peso" * Se for entre 30,0 e 34,9 "Obesidade Grau I" * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)" * Se for maior ou igual que 40,00 "Obesidade Grau III (Mórbida)";
        /*
        //usuario entra com peso e altura
        System.out.println("Digite seu peso: ");
        var peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        var altura = scanner.nextDouble();
        
        //calcula IMC
        var imc = peso / Math.pow(altura, 2);

        
        //imprime resultado
        System.out.println("IMC = " + imc);
        var mensagem = "";

            if (imc <= 18.5){ mensagem = "Abaixo do peso";} else
            if (imc > 18.5 && imc <= 24.9){ mensagem = "Peso Ideal";} else
            if (imc > 24.9 && imc <= 29.9){ mensagem = "Levemente acima do peso";} else
            if (imc > 29.9 && imc <= 34.9){ mensagem = "Obesidade Grau I";} else
            if (imc > 34.9 && imc <= 39.9){ mensagem = "Obesidade Grau II (Severa)";} else
            if (imc > 39.9){ mensagem = "Obesidade Grau III (Mórbida)";}
        
            System.out.println(mensagem);
            scanner.close();
         */

        //EXERCICIO 03 - Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
        /*
        //usuario entra com um numero
        System.out.printf("Digite o primeiro número: ");
        var num1 = scanner.nextInt();

        //usuario entra com segundo numero (maior que o primeiro)
        System.out.printf("Digite o segundo número (lembrando que ele deve ser maior que o primeiro): ");
        var num2 = scanner.nextInt();

        if(num2 <= num1){
            while(num2 <= num1){
                System.out.printf("Segundo número menor que o primeiro, digite novamente: ");
                num2 = scanner.nextInt();
            }
        }

        //usuario escolha par ou impar
        System.out.printf("Par ou Ímpar? ");
        var escolha = scanner.next();
        

        //imprimir todos os números pares ou ímpares no intervalo dos números escolhidos
        switch(escolha.toLowerCase()){
            case "par" -> {
                while(num2 >= num1){
                    if(num2 % 2 == 0){
                        System.out.println(num2);
                    }
                    num2--;
                }
            }
            case "impar" -> {
                while(num2 >= num1){
                    if(num2 % 2 != 0){
                        System.out.println(num2);
                    }
                    num2--;
                }
            }
        }
                scanner.close();
         */
        
        //EXERCICIO 04 - Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados.

        //usuário informa número
        System.out.println("Digite um número:");
        var num1 = scanner.nextInt();  
        var verifica = true;           
        

        //usário irá informar diversos outros números até que que o resto da divisão dif. 0
        //numeros menos que o primeiro devem ser ignorados
        while(verifica){
            System.out.println("Informe outro número:");
            var num2 = scanner.nextInt();
            if(num2 < num1){
                System.out.printf("Digite um número maior que %s\n", num1);
                continue;
            }
            var resultado = num2 % num1;
            verifica = resultado == 0;
            System.out.printf("%s %% %s = %s\n", num2, num1, resultado);
        }

        scanner.close();

    }
}
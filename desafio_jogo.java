 import java.util.Random;
import java.util.Scanner;
/*
public class desafio_jogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int number = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDoUsuario;

        while (tentativas < 5) {
            System.out.println("Digite um numero de 1 a 100");
            numeroDoUsuario = leitura.nextInt();
            tentativas++;

            if (numeroDoUsuario == number) {
                System.out.println("parabens voce acertou o numero");
                break;
            } else if (numeroDoUsuario < number) {
                System.out.println("o numero é maior ");
            } else {
                System.out.println("o numero é menor");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era: " + number);
        }
    }
}

//// DESAFIO 1 ///

public class desafio_jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("NUMERO POSITIVO");
        } else {
            System.out.println("numero negativo");


        }
    }
}

 */
 public class desafio_jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("São iguais");
        }
    }
 }
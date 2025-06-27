import java.util.Scanner;

public class lup {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNOTAS = 0;

        while (nota != -1) {
            System.out.println("Qual sua nota para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media +=  nota;
                totalDeNOTAS++;
            }

        }
        if (totalDeNOTAS > 0 ) {
            System.out.println("Media das avaliações " + media / totalDeNOTAS);
        } else {
            System.out.println("filme foda");
        }

    }
}

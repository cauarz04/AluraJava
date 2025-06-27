import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento");
        int anoDeLacamento = leitura.nextInt();
        System.out.println("Qual sua nota para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLacamento);
        System.out.println(avaliacao);


    }
}


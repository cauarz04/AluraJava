import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        System.out.println("***************************************");
        String nome = "Cauã Rosa";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("------------------------------------");
        System.out.println("Dados de um cleinte");
        System.out.println("\nCliente:  " + nome);
        System.out.println("Tipo conta:  " + tipoConta);
        System.out.println("Saldo:  " + saldo);
        System.out.println("------------------------------------");

        String menu = """
                **Digite sua opção**
                1- Consultar saldo
                2- Enviar Pix
                3- Receber Pix
                4- Sair              
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
        opcao = leitura.nextInt();

        if (opcao == 1 ) {
            System.out.println("Saldo Atual da conta é " + saldo);

        } else if (opcao == 2){
            System.out.println("Qaul valor do pix?");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Nao ha dinheiro na conta");
            } else {
                saldo = saldo - valor;
                System.out.println("Saldo da conta:  " + saldo);

            }
        } else if (opcao == 3) {
            System.out.println("Pix recebido");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("Saldo da conta:  " + saldo);

        }else  if (opcao !=4) {
            System.out.println("Opção Invalida");
        }
        }

    }
}

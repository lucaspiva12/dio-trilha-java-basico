import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do titular: ");
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Porfavor " + nomeCliente + " digitar o número da agencia bancaria: ");
        String agencia = scanner.nextLine();

        System.out.println("Número da agência: ");
        int numero = scanner.nextInt();


        System.out.println("Saldo bancario: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", Seja bem vindo(a) ao nosso banco! Sua agencia é " + agencia + ", conta " + numero + ". Seu saldo é de: " + saldo);
        
       
    

    }
}
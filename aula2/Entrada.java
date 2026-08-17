import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // nextLine(): para fazer a leitura de string
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        //  nextInt(): para fazer a leitura de inteiro
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        //  nextDouble(): para fazer a leitura de um double
        System.out.print("Digite sua altura (em metros): ");
        double altura = entrada.nextDouble();

        //  nextDouble(): para fazer a leitura de um double
        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("\n Dados informados: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");

        // +, usado para string, realiz CONCATENAÇÃO

        entrada.close();

    }
}
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite suas notas: \n");

        System.out.print("Digite sua primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3) /3;

        if (media >= 9) {
            System.out.println("A");
        } else if (media <= 9 && media >= 7){
            System.out.println("B");
        } else if (media <= 7 && media >=5) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        entrada.close();

    }
    
}

// Peça uma frase ao usuário (usando Scanner) e conte quantas vogais ela tem no total,
// mostrando também quantas de cada vogal (a, e, i, o, u) apareceram.
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra =='a'){
                contA++;
            } else if (letra == 'e'){
                contE++;
            } else if (letra == 'i'){
                contI++;
            } else if (letra == 'o'){
                contO++;
            } else if (letra == 'u'){
                contU++;
            }            
        }
        int total1 = contA + contE + contI + contO + contU;

        System.out.println("\nTotal de vogais: \n" + total1);
        System.out.println("a: " + contA);
        System.out.println("e: " + contE);
        System.out.println("i: " + contI);
        System.out.println("o: " + contO);
        System.out.println("u: " + contU);
    }
}

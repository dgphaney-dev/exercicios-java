// Crie um array de 10 inteiros, peça pro usuário preencher cada posição, e depois imprima o array invertido (sem usar um segundo array).

// Vou te ensinar passo a passo, igual fizemos no anterior.

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Array invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
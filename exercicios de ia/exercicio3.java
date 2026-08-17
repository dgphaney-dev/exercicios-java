// // Imprima todos os números primos entre 1 e 100.

// (Lembrando: um número primo é aquele que só é divisível por 1 e por ele mesmo — por exemplo, 2, 3, 5, 7, 11...)

// Dica pra começar a pensar:
// Você vai precisar de dois loops "aninhados" (um dentro do outro):

// O loop de fora percorre os números de 1 a 100
// O loop de dentro checa, para cada número, se ele é divisível por algum outro número menor que ele (se for, não é primo)


public class exercicio3 {
    public static void main(String[] args) {

        for (int numero = 2; numero <= 100; numero++) {
            
            boolean ehPrimo = true;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                }
            }

            if (ehPrimo) {
                System.out.println(numero);
            }
        }
    }
}

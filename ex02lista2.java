import java.util.Scanner;

public class ex02lista2 {
    public static void main(String[] args) {
        System.out.println(" Digite um número ");
        Scanner teclado = new Scanner(System.in);
        double numero;
        numero = teclado.nextDouble();
        teclado.close();

        if (numero < 0) {
            System.out.println(" O número é negativo");
        } else {
            System.out.println(" O número é positivo ");
        }

    }
}

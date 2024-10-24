import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("##-------Vamos multiplicar------##");
        System.out.print("Digite um número inteiro: ");

        try {
            int num1 = input.nextInt();
            System.out.print("Digite o segundo número inteiro positivo: ");
            int num2 = input.nextInt();
            long resultado = MVC.mdc(num1, num2);
            System.out.println("O maior multiplico entre " + num1 + " e " + num2 + " é " + resultado);
        } catch (InputMismatchException im) {
            System.out.println("\nPor favor, insira um número inteiro positivo. Programa encerrado");
        }
        input.close();
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("##-------Vamos multiplicar------##");
        System.out.print("Digite um número inteiro: ");

        try {
            int multiplicando = input.nextInt();
            System.out.print("Digite o número inteiro positivo multiplicador: ");
            int multiplicador = input.nextInt();
            long resultado = SomarMulti.somarMulti(multiplicando, multiplicador);
            System.out.println("A multiplicação de " + multiplicando + " * " + multiplicador + " = " + resultado);
        } catch (InputMismatchException im) {
            System.out.println("\nPor favor, insira um número inteiro positivo. Programa encerrado");
        }
        catch(IllegalArgumentException ilA){
            System.out.println("\n" + ilA.getMessage() +". Programa encerrado");
        }
        input.close();
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("##-------Vamos calcular 2^n------##");
        System.out.print("Digite um número inteiro positivo: ");

        try {
            int numero = input.nextInt();
            long resultado = Calculadora.N2(numero);
            System.out.println("O resultado de 2^" +numero + " é " + resultado);
        } catch (InputMismatchException im) {
            System.out.println("\nPor favor, insira um número inteiro positivo. Programa encerrado");
        }
        catch(IllegalArgumentException ilA){
            System.out.println("\n" + ilA.getMessage() +". Programa encerrado");
        }
        input.close();
        
    }
}

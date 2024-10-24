import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("##-------Vamos Verificar se um número e primo------##");
        System.out.print("Digite um número inteiro positivo: ");

        try {
            int numero = input.nextInt();
            boolean resultado = Primo.isPrimo(numero);
            System.out.println("O número " + numero + " é " + (resultado? "primo": "não é primo"));
        } catch (InputMismatchException im) {
            System.out.println("\nPor favor, insira um número inteiro positivo. Programa encerrado");
        }
        catch(IllegalArgumentException ilA){
            System.out.println("\n" + ilA.getMessage() +". Programa encerrado");
        }
        input.close();
        
    }
}

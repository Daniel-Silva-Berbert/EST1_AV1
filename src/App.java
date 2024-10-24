import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner menu = new Scanner (System.in);
        int opcao = 0;

        do {
            System.out.println("\n##---Fibonacci e Fatorial----##");
            System.out.println("|-----------------------------|");
            System.out.println("| 1 - Fibonacci               |");
            System.out.println("| 2 - Fatorial                |");
            System.out.println("| 3 - Sair                    |");
            System.out.println("|-----------------------------|");
            System.out.print("Digite uma opção (1,2,3): ");

            try {
                opcao = menu.nextInt();

                switch (opcao) {
                    case 1:
                        try {
                            System.out.print("\nDigite um número inteiro positivo para o cálculo de Fibonacci: ");
                            int numero = menu.nextInt();
                            for(int i = 0 ; i <= numero; ++i){
                                long resultado = Calculo.fibonacci(i);
                                System.out.print(resultado + "-");
                            }
                        } catch (InputMismatchException im) {
                            System.out.println("\nPor favor, insira um número inteiro positivo válido para Fibonacci.");
                            menu.next();
                        }
                        catch(IllegalArgumentException ilA){
                            System.out.println("\n" + ilA.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("\nDigite um número inteiro positivo para o cálculo de Fatorial: ");
                            int numero = menu.nextInt();
                            long resultado = Calculo.fatorial(numero);
                            System.out.println("O resultado do Fatorial de " + numero + " é " + resultado + "\n");
                        } catch (InputMismatchException im) {
                            System.out.println("\nPor favor, insira um número inteiro positivo válido para Fatorial.");
                            menu.next();
                        }
                        catch(IllegalArgumentException ilA){
                            System.out.println("\n" + ilA.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("\nAdios\n");
                        break;

                    default:
                        System.out.print("\nOpção Inválida! Tente novamente.\n");
                        break;
                }
            } catch (InputMismatchException im) {
                System.out.println("\nSelecione uma opção válida (1, 2 ou 3): ");
                menu.next(); 
            }
        } while (opcao != 3);

        menu.close();
    }
}

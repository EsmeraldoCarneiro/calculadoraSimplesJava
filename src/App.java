import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe mensagem para o usuário
        System.out.println("Calculadora Simples");

        // Solicita que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        // Lê o primeiro número digitado pelo usuário e converte para o tipo double
        double numero1 = scanner.nextDouble();

        // Limpa o buffer do Scanner para evitar problemas de leitura de dados
        scanner.nextLine();

        // Solicita que o usuário digite o segundo número
        System.out.print("Digite o segundo número: ");
        // Lê o segundo número digitado pelo usuário e converte para o tipo double
        double numero2 = scanner.nextDouble();

        // Limpa o buffer do Scanner novamente
        scanner.nextLine();

        // Exibe as opções de operações disponíveis para o usuário
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        // Lê a escolha da operação digitada pelo usuário e converte para o tipo int
        int operacao = scanner.nextInt();

        // Variável para armazenar o resultado da operação
        double resultado = 0.0;

        // Switch para realizar a operação escolhida pelo usuário
        switch (operacao) {
            case 1:
                // Operação de adição
                resultado = numero1 + numero2;
                break;
            case 2:
                // Operação de subtração
                resultado = numero1 - numero2;
                break;
            case 3:
                // Operação de multiplicação
                resultado = numero1 * numero2;
                break;
            case 4:
                // Operação de divisão
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    // Trata o caso de divisão por zero
                    System.out.println("Não é possível dividir por zero!");
                    // Encerra o programa
                    System.exit(0);
                }
                break;
            default:
                // Caso a operação escolhida seja inválida
                System.out.println("Operação inválida!");
                // Encerra o programa
                System.exit(0);
        }

        // Exibe o resultado da operação na tela
        System.out.println("O resultado da operação é: " + resultado);

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
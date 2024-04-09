import java.util.Scanner;

public class calculadoraJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro valor:");
        float numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor:");
        float numero2 = scanner.nextFloat();

        float resultado = 0;
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (opcao >= 1 && opcao <= 4) {
            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) ;
        System.out.println("-----MENU-------");
        System.out.println("1. Calcular area do quadrado");
        System.out.println("2. Calcular area do circulo");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("area do quadrado: " + areaQuadrado);

        } else if (escolha == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("Área do círculo: " + areaCirculo);
        } else if (escolha == 3)  {
            System.out.println("Programa encerrado");
        } else{
            System.out.println("Opção invalida. Tente novamente.");
        }
        
    }
}

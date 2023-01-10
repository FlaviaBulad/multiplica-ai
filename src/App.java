import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}

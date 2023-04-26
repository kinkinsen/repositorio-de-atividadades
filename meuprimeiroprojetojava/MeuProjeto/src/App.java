import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("idade: ");
        idade = scan.nextInt();
        System.out.println("O "+nome+" possui "+idade+" anos.");
    }
}

import java.util.Scanner;
/*
 * imprime o fatorial 
 * ex: 5!=120
 */
public class Fatorial {
   public static void main (String[] args) {
    int multiplicacao = 1;
    int fatorial;
    Scanner scan = new Scanner(System.in);
    System.out.println("Fatorial: ");
    fatorial = scan.nextInt();
    for(int i = fatorial;i>=1;i--){
        multiplicacao= multiplicacao*i;
    }
    System.out.println(fatorial+"!="+multiplicacao);
   }
}

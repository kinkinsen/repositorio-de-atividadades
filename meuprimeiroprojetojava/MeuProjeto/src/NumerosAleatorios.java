import java.util.Random;
/*
 * Gerar 20 numeros entre 0 e 100 aleatorios num vetor, 
 * e imprimir seus antecessores e sucessores.
 * 
 * 
 */
public class NumerosAleatorios {
    public static void main(String[] args){
        int[] numerosAleatorios = new int[20];
        Random geradonumero = new Random();

        for(int i=0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = geradonumero.nextInt(0,100);
        }
        System.out.println("Numeros aleatorios");
        for (int j : numerosAleatorios) {
            System.out.print(" "+j);
        }
        System.out.println("\nNumeros antecessores");
        for (int j : numerosAleatorios) {
            System.out.print(" "+(j-1));
        }
        System.out.println("\nNumeros sucessores");
        for (int j : numerosAleatorios) {
            System.out.print(" "+(j+1));
        }
    }
}

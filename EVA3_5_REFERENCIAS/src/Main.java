import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = new int [10];
        System.out.println(arreglo);
        for (int i : arreglo) {
            System.out.println(i);
        }
        String[][] arreCade = new String[10][10];
        System.out.println(arreCade);
        Scanner input = new Scanner(System.in);
        System.out.println(input);
    }
}
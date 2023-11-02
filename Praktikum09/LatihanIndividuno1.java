package Praktikum09;
import java.util.Scanner;
public class LatihanIndividuno1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arrayPertama = {1, 2, 3, 4, 5,};
        int[] arrayKedua = new int [arrayPertama.length];

        for (int i = 0; i < arrayPertama.length; i++) {
            arrayKedua[i] = arrayPertama[i];
        }
        System.out.print("Array Kedua: ");
            for (int i = 0; i< arrayKedua.length; i++) {
                System.out.print(arrayKedua[i] + " ");
            }
            
    }
    
}

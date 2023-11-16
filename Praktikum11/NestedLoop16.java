package Praktikum11;
import java.util.Scanner;
public class NestedLoop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Msukan Jumlah Kota: ");
        int n = sc.nextInt();

        double[][] suhu = new double[2][4];
        double[] rataRata = new double[5];

      for (int i = 0; i < suhu.length; i++) {
           System.out.println("KOTA KE-" + i);
           double temp = 0;
           
            for (int j = 0; j < suhu[i].length; j++) {
              System.out.print("Suhu ke-" + ( j + 1) + ": ");
              suhu[i][j] = sc.nextInt();
              temp += suhu [i][j];
           }
           rataRata[i] = temp / suhu.length;
            System.out.println();
        
          }
           for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i + 1) + ": ");
             
            for (int j = 0; i< suhu.length; j++){
              System.out.print(suhu[i][j] + " ");
            }
            }
          
          //  System.out.println( " Rata Rata suhu : " + rataRata[i]);
           

          }
}


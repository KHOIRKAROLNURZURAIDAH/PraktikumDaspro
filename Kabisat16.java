import java.util.Scanner;
public class Kabisat16 {
    public static void main(String[] args) {
        
        Scanner input16 = new Scanner (System.in);
        int tahun;

        System.out.println(" Maukkan Tahun Kabisat: ");
             tahun=input16.nextInt();

             if ((tahun %4 == 0) && ( tahun %100 !=0) || (tahun %4 == 0) && (tahun %100 !=0)){
                 System.out.println( "Tahun Kasit");
             } else {
                System.out.println("Bukan Tahun Kabisat");
             }


    }
    
}

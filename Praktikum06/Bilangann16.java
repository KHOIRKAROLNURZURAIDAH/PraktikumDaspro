import java.util.Scanner;
public class Bilangann16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        int bil1, bil2, bil3;
        int bilBesar;

        System.out.println("Masukan Bilangan 1 : ");
        bil1 = input16.nextInt();
        System.out.println("Masukan Bilangan2 : ");
        bil2 = input16.nextInt();
        System.out.println("Masukan Bilangan3 : ");
        bil3 = input16.nextInt();

        if (bil1 >=bil2){
            if (bil1 >= bil3){
                System.out.println("Bilangan terbesar: " + bil1);
            } else {
                System.out.println(" Bilangan terbesar: " + bil3);
            }
        } else {
            if (bil1 >= bil3){
                System.out.println("Bilangan terbesar:  " + bil2);
            }else{
                System.out.println("Bilangan terbesar: " + bil3);
            }
        }
    }
    
}

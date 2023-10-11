import java.util.Scanner;
public class KabisatNested16 {
    public static void main(String[] args) {

        Scanner input16 = new Scanner (System.in);
            Integer tahun;

            System.out.println(" Maukkan Tahun Kabisat: ");
             tahun=input16.nextInt();
     
        if ((tahun % 400) == 0){
                System.out.println("Tahun Kabisat");
            }else if ((tahun % 100)== 0){
                System.out.println("Bukan Tahun Kabisat");
            }else if ((tahun % 4)== 0){
                System.out.println("Tahun Kabisat");
            }else
                 System.out.println("Bukan Tahun Kabisat");
            
    
    }
    
}

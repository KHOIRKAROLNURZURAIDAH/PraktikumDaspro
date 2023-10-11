import java.util.Scanner;
public class Segitigaa16 {

    public static void main(String[] args) {
        
        Scanner input16 = new Scanner (System.in);
        float sudut1,sudut2, sudut3;
        double totalsudut;

        System.out.println("Masukkan sudut1: ");
        sudut1 = input16.nextFloat();
        System.out.println("Masukkan sudut2: ");
        sudut2 = input16.nextFloat();
        System.out.println("Masukkan sudut3: ");
        sudut3 = input16.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                 System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }   else if ((sudut1 == sudut2 && sudut1 == sudut3  && sudut2 == sudut3)) {
                 System.out.println("Segitiga tersebut adalah sama sisi");
        }   else if ((sudut1 == sudut2 || sudut1 == sudut3 || sudut3 == sudut2)) {
                 System.out.println("Segitiga tersebut adalah segitiga sama kaki");
        } else if ((sudut1 == sudut2 || sudut1 == sudut3 || sudut3 == sudut2)) {
                 System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }  else {
             System.out.println("Bukan Segitiga");
        }
            
        }
                
    }

    
        


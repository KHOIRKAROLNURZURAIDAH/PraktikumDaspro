import java.util.Scanner;
improt java.util.Scanner;
public class Segitiga16 {

    public static void main(String[] args) {

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180){
            if ((sudut1 == 90) || (sudut3 == 90))
                 System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else 
                 System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        }   else
                System.out.println("Bukan Segitiga");
    }
    
}

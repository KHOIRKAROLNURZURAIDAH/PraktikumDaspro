package Praktikum14;
import java.util.Scanner;
public class Pangkat16 {
    public static void main(String[] args) {
        pangkat(2, 5);
    }

    static void pangkat (int x, int y) {
        int hasil = 1;

        for (int i = 0; i < y; i++) {
            hasil = hasil * x;
            System.out.print(x);

            if (i < y - 1) {
                System.out.print("x");
            } else {
                System.out.print("x1");
            }
        }

        System.out.println(" = " + hasil);
    }
    }











//         if (y == 0) {
//             return 1;
//         }else{
//             return x *pangkat (x,y - 1);
//         }
//     }
//    public static int pangkatIterative(int x, int y) {
//         int hasil = 1;

//         for (int i = 1; i <= y; i++) {
//             hasil = hasil * x;
//         }

//         return hasil;
//     }
//    public static void main(String[] args) {
//     System.out.println(pangkat(6, 4));
//     System.out.println(pangkatIterative(6, 4));
//    }
// }






// if (y == 0) {
    //     return 1;
    // }else{
    //     return x *pangkat(x,y - 1);
    // }
import java.util.Scanner;
public class NestedTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.println("Masukan Bilangan Pertama");
        bil1 = sc.nextInt();
        System.out.println("Masukan Bilangan Kedua");
        bil2 = sc.nextInt();
        System.out.println("Masukan Bilangan Ketiga");
        bil3 = sc.nextInt();


        String largest = (bil1 > bil2) ? (bil1 > bil3) ? "bil1" : "bil3" : "bil2";
        System.out.println("Bilangan Terbesar = " + largest);
    }
}

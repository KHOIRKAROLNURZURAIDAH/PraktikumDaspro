import java.util.Scanner;

public class PemilihanOperator16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();

        // if (angka1< 30) {
        // System.out.println("c");
        // }
        // else if (angka1< 50) {
        // System.out.println("b");
        // }

        System.out.print("Masukkan angka 2:");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - *:)");

        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
        } else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        } else {
            System.out.println("Operator tidak sesuai");
            return;
        }
        // System.out.println(String.format("%s %c %s", angka1, operator, angka2,
        // hasil));
    }

}

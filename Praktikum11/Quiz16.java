package Praktikum11;

import java.util.Scanner;
import java.util.Random;

public class Quiz16 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success =false;
        do {
            System.out.print("Tebak angka (1 - 10) : ");
            int answer = sc.nextInt();
            sc.nextLine();
            success = (answer == number);
        } while (!success);
        System.out.print("Apakah Anda ingin mengulangi permainan (y/Y)?");
        menu = sc.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y'); 
            
        }
        
    }

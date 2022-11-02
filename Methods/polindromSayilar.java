package Methods;

import java.util.Scanner;

public class polindromSayilar {
    // Bir sayının polindrom sayı olup olmadığını bulan program

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp !=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber) {
            System.out.println("Polindrom sayıdır.");
            return true;
        } else {
            System.out.println("Polindrom sayı değildir.");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz : ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n));
    }
}

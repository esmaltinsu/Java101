package Methods;
import java.util.Scanner;

public class recursiveFibonacci {
    static int fib(int n) {
        if (n==1 || n==2) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Sayıyı Giriniz: ");
        int number= input.nextInt();
        System.out.println("Fibonacci Değeri: f("+number+")=" +fib(number));
        input.close();
    }
}

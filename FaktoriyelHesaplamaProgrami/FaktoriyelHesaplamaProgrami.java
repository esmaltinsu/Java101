import java.util.Scanner;
public class FaktoriyelHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktöriyel Sayısını Giriniz : ");
        int n = scan.nextInt();
        int total = 1;

        for (int i=1; i<=n ; i++) {
            total = total * i;
        }
        System.out.println(n + ". Faktöriyel: " +total);
    }
}

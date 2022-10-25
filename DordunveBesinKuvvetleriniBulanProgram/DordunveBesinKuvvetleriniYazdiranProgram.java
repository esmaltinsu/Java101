import java.util.Scanner;
public class DordunveBesinKuvvetleriniYazdiranProgram {
    // Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Değer Giriniz: ");
        n= input.nextInt();

        System.out.println(n + " sayısına kadar olan dördün kuvvetleri : ");
        for (int i = 1; i<=n; i*=4) {
            System.out.println(i + "  ");
        }
        System.out.println(n + " sayısına kadar olan beşin kuvvetleri: ");
        for (int i = 1; i<=n; i*=5) {
            System.out.println(i + "  ");
        }

    }
}

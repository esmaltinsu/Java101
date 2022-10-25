import java.util.Scanner;
public class DordunKatlariVeCiftSayilariTopla {
    public static void main(String[] args) {
        int k , toplam =0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen Bir Değer Giriniz : ");
            k = input.nextInt();
            if (k%2 == 0 && k%4 == 0){
                toplam +=k;
            }
        } while (k%2 == 0);
        System.out.println("Toplam =  " +toplam);
    }

}

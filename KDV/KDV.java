import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        /* Eğer girilen tutar 0 ve 1000 TL arasında
         ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını
         %8 olarak KDV tutarı hesaplayan programı yazınız. */
        double tutar , kdvTutar , kdvliTutar , kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        kdvOrani= tutar<=1000 ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println ("KDV'li Toplam Tutar : " + kdvliTutar);


    }
}

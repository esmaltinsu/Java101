import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutFiyat = 2.14 ;
        double elmaFiyat = 3.67 ;
        double domatesFiyat = 1.11 ;
        double muzFiyat = 0.95 ;
        double patlicanFiyat = 5.0 ;
        double armutMiktari , elmaMiktari , domatesMiktari , muzMiktari , patlicanMiktari ;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : " );
        armutMiktari = input.nextDouble();

        System.out.print("Elma kaç kilo? : " );
        elmaMiktari = input.nextDouble();

        System.out.print("Domates kaç kilo? : " );
        domatesMiktari = input.nextDouble();

        System.out.print("Muz kaç kilo? : " );
        muzMiktari = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : " );
        patlicanMiktari = input.nextDouble();

        double toplamTutar ;

        toplamTutar= (armutFiyat*armutMiktari)+(elmaFiyat*elmaMiktari)+(domatesFiyat*domatesMiktari)+(muzMiktari*muzMiktari)+(patlicanFiyat*patlicanMiktari);
        System.out.print("Toplam Tutar: " + toplamTutar + " TL");


    }




    }

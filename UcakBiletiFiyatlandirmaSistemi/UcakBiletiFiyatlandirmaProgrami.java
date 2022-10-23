import java.util.Scanner;
public class UcakBiletiFiyatlandirmaProgrami {
    public static void main(String[] args) {
        int km, age, tripType ;
        double perKm = 0.10;
        double total, discountedTtl, ageDiscount, tripTypeDiscount, lastTotal, ageDiscountRate;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi KM Cinsinden Giriniz: ");
        km = input.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.println("Yolculuk tipini seçiniz. 1 --> Tek yön, 2 --> Gidiş - Dönüş : ");
        tripType = input.nextInt();

        if (( km>0 ) && (age > 0) && (tripType ==1 ||  tripType== 2)) {

            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (age > 12 && age < 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            } else {
                ageDiscountRate = 1;
            }

            total = km*perKm;
            ageDiscount = total * ageDiscountRate;
            discountedTtl = total - ageDiscount;
            lastTotal = discountedTtl;


            if (tripType == 2) {
                tripTypeDiscount = discountedTtl*0.20 ;
                lastTotal = (discountedTtl-tripTypeDiscount)*2 ;
            } else {
                lastTotal = discountedTtl;
            }
            System.out.println("Normal Fiyat Tutarı: " +total + "TL");
            System.out.println("İndirimli Toplam Fiyat Tutarı: " +discountedTtl + "TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz! ");
        }

    }
}

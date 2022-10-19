import java.util.Scanner;
public class SinfGecmeDurumu {

    public static void main(String[] args) {
        double mat, fizik , turkce , kimya , muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat= inp.nextDouble();
        if (mat < 0 ) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz." ); }
           else if (mat > 100) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz.");
           } else {
            System.out.println("Değeriniz alınmışıtr.");
           }

        System.out.println("Fizik Notunuz: ");
        fizik= inp.nextDouble();
        if (fizik < 0 ) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz." ); }
        else if (fizik > 100) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz.");
        } else {
            System.out.println("Değeriniz alınmışıtr.");
        }

        System.out.println("Türkçe Notunuz: ");
        turkce= inp.nextDouble();
        if (turkce < 0 ) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz." ); }
        else if (turkce > 100) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz.");
        } else {
            System.out.println("Değeriniz alınmışıtr.");
        }

        System.out.println("Kimya Notunuz: ");
        kimya= inp.nextDouble();
        if (kimya < 0 ) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz." ); }
        else if (kimya > 100) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz.");
        } else {
            System.out.println("Değeriniz alınmışıtr.");
        }

        System.out.println("Müzik Notunuz: ");
        muzik= inp.nextDouble();
        if (muzik < 0 ) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz." ); }
        else if (muzik > 100) {
            System.out.println("Lütfen 0-100 referans aralığında bir değer giriniz.");
        } else {
            System.out.println("Değeriniz alınmışıtr.");
        }

            double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
            if (avarage < 55) {
                System.out.println("Sınıfı geçemediz.Not ortalamanız 55'in altındadır. ");
            } else {
                System.out.println(" Tebrikler! Sınıfı başarıyla geçtiniz.");
            }
            System.out.println("Ortalamanız: " + avarage);
    }
}



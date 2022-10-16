import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        int kilo ;
        double boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz: ");
        kilo = input.nextInt();

        double vucutKitleIndeksi;
        vucutKitleIndeksi = kilo / (boy * boy) ;

        System.out.print("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
    }


    }

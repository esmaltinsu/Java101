import java.util.Scanner;
public class DikUcgenHipotenus {
    public static void main(String[] args) {

        // Hipotenüs hesapladım.

        double birinciKanar , ikinciKenar, hipotenus ;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Kenarın Değerini Giriniz: ");
        birinciKanar = input.nextDouble();

        System.out.print("İkinci Kenarın Değerini Giriniz: ");
        ikinciKenar = input.nextDouble();
       /*
        hipotenus= ((birinciKanar*birinciKanar) + (ikinciKenar*ikinciKenar)) ;

        System.out.print("Hipotenüs Değeri : " + Math.sqrt(hipotenus)); */

        // Üç kenar uzunluğunu kullanıcıdan aldığınız dik üçgenin alanını hesaplayan program. //

        System.out.print( "Dik Üçgenin alanı : " + ((birinciKanar*ikinciKenar)/2)) ;


    }

}


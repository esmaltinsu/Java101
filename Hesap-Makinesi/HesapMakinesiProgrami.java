import java.util.Scanner;
public class HesapMakinesiProgrami {
    public static void main(String[] args) {

        int number1, number2, select  ;
        Scanner input = new Scanner(System.in);

        System.out.print ("İlk Sayıyı Giriniz : ") ;
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
       /*
            if (select == 1) {
            System.out.println("Toplam: " + (number1 + number2));
        }
            else if (select == 2) {
            System.out.println("Çıkarma : " + (number1-number2));
        }
            else if (select ==3 ){
            System.out.println("Çarpma : " + (number1*number2));
        }
            else if (select ==4 ) {
                if (number2 !=0 ) {
                    System.out.println("Bölme : " + (number1/number2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
            System.out.println("Bölme : " + (number1/number2));
        } */

        switch (select) {
            case 1 :
                System.out.println("Toplam: "  + (number1+number2));
                break;
            case 2 :
                System.out.println("Çıkarma : " + (number1-number2));
                break ;
            case 3 :
                System.out.println("Çarpma : "  + (number1*number2));
                break;
            case 4 :
                switch (number2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez! ");
                        break;
                    default:
                        System.out.println("Bölme : " + (number1/number2));
                }
            break;
            default:
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin.");
        }
    }
}

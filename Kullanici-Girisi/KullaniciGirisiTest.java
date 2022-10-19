import java.util.Scanner;
public class KullaniciGirisiTest {

    public static void main(String[] args) {

        String userName,password, newPassword ;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : " );
        userName= inp.nextLine();

        System.out.print("Şifreniz: ");
        password= inp.nextLine();

        if (userName.equals("esma" ) && password.equals("9798")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz hatalı. Eğer şifreyi değiştirmek istiyorsanız 1'i, istemiyorsanız 2'yi seçiniz! ");
            select=inp.nextInt();
        switch (select) {
            case 1 :
                System.out.println("Lütfen yeni şifreyi giriniz. ");
                newPassword=inp.next();
                if (newPassword.equals("9798")) {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz! ");
                } else {
                    System.out.println("Yeni şifre oluşturuldu!");
                }
                break ;
            case 2 :
                System.out.println("Oturumunuz sonlandırılmıştır.");
        }

        }
    }
}



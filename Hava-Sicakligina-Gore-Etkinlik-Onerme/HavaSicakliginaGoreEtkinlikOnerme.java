import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Bugün kayak yapmak için güzel bir gün!");
        } else if (heat>= 5 && heat <=25 ) {
            if (heat <= 15) {
                System.out.println("Bugün sinemaya gitmek için güzel bir gün!");
            }
            if (heat >= 10) {
                System.out.println("Bugün pikniğe gitmek için güzel bir gün!");
            }
        } else if (heat > 25) {
            System.out.println("Bugün yüzmeye gitmek için güzel bir gün!");
        }
    }
}

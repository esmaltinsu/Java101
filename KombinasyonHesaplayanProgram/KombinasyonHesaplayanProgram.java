import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, comb, facN = 1, facR = 1, facNr = 1;

        System.out.println("C(n,r) bicimindeki n degerini giriniz: ");
        n = input.nextInt();
        System.out.println("C(n,r) bicimindeki r degerini giriniz: ");
        r = input.nextInt();

        for (int i =1; i<=n ; i++) {
            facN = facN * i ;
        }
        for (int j=1 ; j <=n ; j++) {
            facR = facR * j;
        }

        int nFarkR = n-r ;

        for (int k=1 ; k <= nFarkR; k++) {
            facNr = facNr * k;
        }

        comb= facN / (facR * facNr);
        System.out.println("C(" + n + "," + r + ")=" +comb);

    }

}

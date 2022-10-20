import java.util.Scanner;
public class BurcHesaplama {
    public static void main(String[] args) {
        int month, day;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz Ay : ");
        month = input.nextInt();

        System.out.println("Doğduğunuz Gün : ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else if (day > 0 && day <= 31) {
                    burc = "Kova";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else if (day > 0 && day <= 29) {
                    burc = "Balık";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else if (day > 0 && day <= 31) {
                    burc = "Koç";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else if (day > 0 && day <= 30) {
                    burc = "Boğa";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else if (day > 0 && day <= 31) {
                    burc = "İkizler";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                } else if (day > 0 && day <= 30) {
                    burc = "Yengeç";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else if (day > 0 && day <= 31) {
                    burc = "Aslan";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else if (day > 0 && day <= 31) {
                    burc = "Başak";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak";
                } else if (day > 0 && day <= 30) {
                    burc = "Terazi";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else if (day > 0 && day <= 31) {
                    burc = "Akrep";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else if (day > 0 && day <= 30) {
                    burc = "Yay";
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else if (day > 0 && day <= 31) {
                    burc = "Oğlak";
                }
            }
        }
        if ((month > 12) || (month < 1)) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz: " +burc);
        }
    }
}

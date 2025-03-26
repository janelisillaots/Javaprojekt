import java.util.Scanner;

public class Peaklass {

    public static void main(String[] args) {
        mänguReeglid();
        Konto mängijaKonto = new Konto();
        Analyys analüüs = new Analyys();
        int mängudeArv = 0;

        while (true) {
            väljastaTegevused();
            Scanner sc = new Scanner(System.in);
            int tegevus = sc.nextInt();
            if (tegevus == 1) {
                mängijaKonto.rahaSisse();
            } else if(tegevus == 2) {
                mängijaKonto.ostaPilet();
                int k1 = sc.nextInt();
                int k2 = sc.nextInt();
                int k3 = sc.nextInt();
                Loos loos = new Loos(k1, k2, k3);
                loos.loosimine();
                mängudeArv++;
            } else {
                break;
            }
        }
    }

    public static void väljastaTegevused() {
        System.out.println("Millist tegevust soovid teha?");
        System.out.println("1 - laadi raha;");
        System.out.println("2 - osta pilet ja mängi");
        System.out.println("3 - lõpp");
    }

    public static void mänguReeglid() {

    }
}

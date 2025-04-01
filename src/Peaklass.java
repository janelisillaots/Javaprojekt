import java.util.Scanner;

public class Peaklass {

    public static void main(String[] args) {
        mänguReeglid();
        Konto mängijaKonto = new Konto();
        Analyys analüüs = new Analyys();
        int mängudeArv = 0;

        while (true) { // käivitame mängutsükli
            väljastaTegevused();
            Scanner sc = new Scanner(System.in);
            int tegevus = sc.nextInt();
            if (tegevus == 1) {
                mängijaKonto.rahaSisse();
            } else if (tegevus == 2) {
                boolean kasUusMäng = mängijaKonto.ostaPilet();
                if (kasUusMäng) {
                    System.out.println("Sisesta lotole kolm numbrit (0-9). ");
                    int k1 = sc.nextInt();
                    int k2 = sc.nextInt();
                    int k3 = sc.nextInt();
                    Loos loos = new Loos(k1, k2, k3);
                    loos.loosimine(mängijaKonto, analüüs);
                    mängudeArv++;
                } else {
                    continue;
                }
            } else {
                if (mängijaKonto.getJääk() > 0) {
                    System.out.println("Välja makstav summa: " + mängijaKonto.getJääk() + " eurot.");
                }
                break;
            }
            System.out.println("Konto jääk: " + mängijaKonto.getJääk() + " eurot.");
        }
        // analüüs mängitud mängude põhjal
        System.out.println("Mängisid kokku " + mängudeArv + " mängu.");
        int piletiteRaha = mängijaKonto.getPiletihind()*mängudeArv;
        System.out.println("Piletitele kulus " + piletiteRaha + " eurot.");

        int võidetudSumma = analüüs.väljastaVõidud(); // väljastab eraldi kõik võidetud summad

        // vaatame, kas kasutaja jäi kasumisse või kahjumisse
        int kasumKahjum = võidetudSumma - piletiteRaha;
        if (kasumKahjum > 0) {
            System.out.println("Teenitud kasum: " + kasumKahjum + " eurot.");
        } else if (kasumKahjum < 0) {
            System.out.println("Jäid kahjumisse " + (piletiteRaha - võidetudSumma) + " euroga.");
        } else {
            System.out.println("Mängudega ei teenutud kasumit ega jäädud kahjumisse.");
        }

    }

    public static void väljastaTegevused() {
        System.out.println("Millist tegevust soovid teha?");
        System.out.println("1 - laadi raha;");
        System.out.println("2 - osta pilet ja mängi");
        System.out.println("3 - lõpp");
    }

    public static void mänguReeglid() {
        System.out.println("Kiirloterii mäng Vali 3!");
        System.out.println("Pane oma õnn proovile ja arva ära salajane kood. Mängimine on ülilihtne! Osta pilet (2 eurot) ja vali kolm arvu.");
        System.out.println("");
        System.out.println("AUHINNAD");
        System.out.println("30€ - PEAVÕIT arvad koodi õigesti ära");
        System.out.println("15€ - arvad ära kõik 3 numbrit, kuid järjekord pole päris õige");
        System.out.println("5€ - arvad ära 2 numbrit");
        System.out.println("2€ - arvad ära 1 numbri");
        System.out.println("");
    }
}

import java.util.Random;

public class Loos {

    private int k1;
    private int k2;
    private int k3;

    // k1, k2, k3 on kasutajalt peameetodi tsüklis küsitud numbrid
    public Loos(int k1, int k2, int k3) {
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }


    public void loosimine(Konto konto, Analyys analyys) {
        Random rand = new Random();
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10);
        int n3 = rand.nextInt(10);
        System.out.println("Loositi numbrid " + n1 + " " + n2 + " " + n3);

        if (k1==n1 && k2==n2 && k3==n3) {
            System.out.println("Peavõit! Arvasid kõik numbrid õiges järjekorras ära!");
            System.out.println("Võitsid 30 eurot."); //võidusumma, lisada võitudesse ja kontole
            konto.rahaSisse(30);
            analyys.võiduLisamine(30);

        } else if (
                (k1==n1 && k2==n3 && k3==n2) ||
                        (k1==n3 && k2==n2 && k3==n1) ||
                        (k1==n2 && k2==n1 && k3==n3) ||
                        (k1==n3 && k2==n1 && k3==n2) ||
                        (k1==n2 && k2==n3 && k3==n1)) {
            System.out.println("Võit! Arvasin kõik numbrid ära!");
            System.out.println("Võitsid 15 eurot."); //võidusumma, lisada võitudesse
            konto.rahaSisse(15);
            analyys.võiduLisamine(15);

        } else if (
                (k1==n1 && k2==n2) ||
                        (k1==n1 && k2==n3) ||
                        (k1==n2 && k2==n1) ||
                        (k1==n2 && k2==n3) ||
                        (k1==n3 && k2==n1) ||
                        (k1==n3 && k2==n2) ||

                        (k1==n1 && k3==n2) ||
                        (k1==n1 && k3==n3) ||
                        (k1==n2 && k3==n1) ||
                        (k1==n2 && k3==n3) ||
                        (k1==n3 && k3==n1) ||
                        (k1==n3 && k3==n2) ||

                        (k2==n1 && k3==n2) ||
                        (k2==n1 && k3==n3) ||
                        (k2==n2 && k3==n1) ||
                        (k2==n2 && k3==n3) ||
                        (k2==n3 && k3==n1) ||
                        (k2==n3 && k3==n2)) {

            System.out.println("Võit! Arvasid kaks numbrit ära!");
            System.out.println("Võitsid 5 eurot."); //võidusumma, lisada võitudesse
            konto.rahaSisse(5);
            analyys.võiduLisamine(5);

        } else if (k1==n1 || k1==n2 || k1==n3 || k2==n1 || k2==n2 || k2==n3 || k3==n1 || k3==n2 || k3==n3) {

            System.out.println("Võit! Arvasid ühe numbri ära!");
            System.out.println("Võitsid 2 eurot."); //võidusumma, lisada võitudesse
            konto.rahaSisse(2);
            analyys.võiduLisamine(2);

        } else {
            System.out.println("Kahjuks seekord ei võitnud!");
        }
    }

}
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.max;

public class Analyys {
    private List<Integer> võidetudSummad;

    public Analyys() {
        this.võidetudSummad = new ArrayList<>();
    }

    public List<Integer> getVõidetudSummad() {
        return võidetudSummad;
    }

    public void võiduLisamine(int võit) {
        võidetudSummad.add(võit);
    }

    public int väljastaVõidud() { // väljastab võidetud summad eraldi, lisab ka võidetud kogusumma, väljastab ka suurima võidu, tagastab võidetud kogusumma
        int koguSumma = 0;
        System.out.print("Lotomänguga võidetud rahasummad: ");
        for (int võit : this.võidetudSummad) {
            System.out.print(võit + " eurot; ");
            koguSumma += võit;
        }
        System.out.println();
        System.out.println("Suurim võitudest: " + max(this.võidetudSummad) + " eurot.");
        System.out.println("Lotoga võidetud kogusumma: " + koguSumma + " eurot.");

        return koguSumma;
    }

}

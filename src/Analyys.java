import java.util.ArrayList;
import java.util.List;

public class Analyys {
    private List<Integer> võidetudSummad;

    public Analyys() {
        this.võidetudSummad = new ArrayList<>();
    }

    public void võiduLisamine(int võit) {
        võidetudSummad.add(võit);
    }

    public void väljastaVõidud() {
        System.out.print("Sinu lotomänguga võidetud rahasummad: ");
        for (int võit : this.võidetudSummad){
            System.out.print(võit + " eurot, ");
        }
    }

import java.util.Scanner;

public class Konto {
    private int jääk;
    private int piletihind;

    public Konto() {
        this.jääk = 0;
        this.piletihind = 2;
    }

    public void rahaSisse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta summa, mille soovid kontole lisada.");
        int rahasumma = sc.nextInt();
        this.jääk += rahasumma;
        System.out.println("Sinu kontole lisati " + rahasumma + " eurot.");
    }

    public void rahaSisse(int summa) { // peale võitu saab raha panna kontole
        this.jääk += summa;
    }

    public int getJääk() {
        return jääk;
    }

    public int getPiletihind() {
        return piletihind;
    }

    public void ostaPilet() {
        if (this.jääk >= piletihind) {
            System.out.println("Uus lotopilet on edukalt ostetud.");
            this.jääk -= piletihind;
        } else {
            System.out.println("Kontol pole piisavalt vahendeid, laadi raha ning proovi uuesti.");
        }
    }
}

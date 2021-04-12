import java.util.Scanner;

class Kino {
   private int reihe;
   private int sitz;

   public Kino() {

   }

   public int getSitz(){
       return sitz;
   }

    public void setSitz(int sitz) {
        this.sitz = sitz;
    }

    public int getReihe(){
       return reihe;
   }

    public void setReihe(int reihe) {
        this.reihe = reihe;
    }
}

public class Sitzplan {
    public static void main(String[] args) {
        Kino kn = new Kino();
        int [][] sp_array = new int[5][10];

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Welche Reihe?");
        int reiheEingabe = eingabe.nextInt();
        System.out.println("Welches Sitz?");
        int sitzEingabe = eingabe.nextInt();


        sp_array [][] = [reihe][sitz];

    }
}

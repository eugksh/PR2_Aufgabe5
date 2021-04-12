import java.util.Scanner;

class Kino {
   private int reihe;
   private int sitz;

   public Kino() {
       int [][] sp_array = new int[5][10];
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
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Welche Reihe?");
        kn.setReihe(eingabe.nextInt());
        System.out.println("Welches Sitz?");
        kn.setSitz(eingabe.nextInt());


        sp_array [][] = [reihe][sitz];

    }
}

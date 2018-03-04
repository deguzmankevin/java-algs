package dragonball;

/**
 * Created by Kevin on 3/4/2018.
 */
public class TestSaiyan {
    public static void main (String[] args) {
        dragonball.Saiyan Goku = new dragonball.Saiyan(100, "yellow");
        dragonball.Saiyan Vegeta = new dragonball.Saiyan(100);
        Goku.powerUp();
        Vegeta.scream();
    }
}

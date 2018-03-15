package funstuff.Dragonball;
import java.util.ArrayList;
/**
 * Created by Kevin on 3/5/2018.
 */
public class Human extends Being{
    private int powerLevel = 25;
    private String hairColor;
    private int speed = 5;
    private ArrayList<DragonBall> dragonballs;
    public Human(int p) {
        powerLevel = p;
    }
    public Human(int p, String h) {
        powerLevel = p;
        h = hairColor;
    }
    public void yell(String phrase) {
        System.out.println(phrase);
    }


    public void summon() {
        if (dragonballs.size() == 6) {
            Dragon Shenron = new Dragon();
            Shenron.wish();
        }
        return;
    }

}

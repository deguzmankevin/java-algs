package funstuff.Dragonball;

/**
 * Created by Kevin on 3/5/2018.
 */
public class Human extends Being{
    private int powerLevel = 25;
    private String hairColor;
    private int speed = 5;
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


}

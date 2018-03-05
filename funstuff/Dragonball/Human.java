package funstuff.Dragonball;

/**
 * Created by Kevin on 3/5/2018.
 */
public class Human {
    private int powerLevel = 25;
    private String hairColor;

    public Human(int p) {
        powerLevel = p;
    }
    public Human(int p, String h) {
        powerLevel = p;
        h = hairColor;
    }
    public String yell(String phrase) {
        System.out.println(phrase);
    }


}

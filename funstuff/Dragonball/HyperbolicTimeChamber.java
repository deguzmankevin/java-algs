package funstuff.Dragonball;

import java.util.ArrayList;

/**
 * Created by Kevin on 3/14/2018.
 */
public class HyperbolicTimeChamber extends Place {
    private int capacity;
    private ArrayList<Being> beings;

    //train a being for t hours
    public void train(Being b, int t) {
        if (t > 50) {
            System.out.println("You cannot train for that long.");
            return;
        }
        b.powerLevel *= t;
        System.out.println("I feel so much stronger!");
        return;
    }
}

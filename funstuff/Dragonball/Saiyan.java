package dragonball;

class Saiyan {
    private int powerLevel = 100;
    private String hairColor = "black";

    public Saiyan (int p) {
        powerLevel = p;
    }
    public Saiyan(int p, String h) {
        /**Create a saiyan with a base power level and hair color **/

        powerLevel = p;
        hairColor = h;
        if (h == "yellow") {
            powerLevel *= 50;
        }
    }
    public int getPowerLevel() {
        return powerLevel;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void powerUp() {
        scream();
        powerLevel *= 2;
        System.out.println("Your power has grown to " + powerLevel);
    }
    public void scream() {
        System.out.println("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }


}
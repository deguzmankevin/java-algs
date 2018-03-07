package dragonball;

class Saiyan {
    private int powerLevel = 100;
    private String hairColor = "black";
    private int speed;
    private String stage = "Base Form";
    public Saiyan (int p) {
        powerLevel = p;
        speed = 50;
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
        speed *= 2;
        System.out.println("Your power has grown to " + powerLevel);
    }
    public void scream() {
        System.out.println("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    public void superSaiyan(int p) {
        if (p == 1) {
            powerLevel *= 50;
            speed *= 10;
        }
        else if (p == 2) {
            powerLevel *= 100;
            speed = speed / 3;
        }
        else if (p == 3) {
            powerLevel *= 150;
            speed = speed / 2;
        }
        else {
            System.out.println("You are not yet strong enough to ascend.");
        }



    }
    public Saiyan fusionDance(Saiyan s1, Saiyan s2) {
        if (Math.abs(s1.powerLevel - s2.powerLevel) < 1000)  {
            Saiyan s3 = new Saiyan((s1.powerLevel + s2.powerLevel) * 100);
            s3.speed = (s1.speed + s2.speed) * 50;
            return s3;
        }
        return null;
    }

}
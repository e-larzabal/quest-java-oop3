public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it

        System.out.println("");
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();

        Eagle EyeCherry = new Eagle("Eye Cherry");

        System.out.println("");
        EyeCherry.takeOff();            // Eye Cherry takes off in the sky.
        EyeCherry.ascend(120);  // Eye Cherry flies upward, altitude : 120
        EyeCherry.ascend(150);  // Eye Cherry flies upward, altitude : 150
        EyeCherry.glide();              // It glides into the air.
        EyeCherry.descend(10);  // Eye Cherry flies downward, altitude : 10
        EyeCherry.cantLand();           // Eye Cherry is too high, it can't lands.
        EyeCherry.descend(1);   // Eye Cherry flies downward, altitude : 1
        EyeCherry.land();               // Eye Cherry lands on the ground.

    }
}

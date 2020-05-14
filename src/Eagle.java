public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setAltitude(int altitude) { this.altitude = altitude; }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName()+" takes off in the sky.");
    }

    @Override
    public void ascend(int altitude) {
        this.setAltitude(altitude);
        System.out.println(this.getName()+" flies upward, altitude : "+this.getAltitude());
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public void descend(int altitude) {
        this.setAltitude(altitude);
        System.out.println(this.getName()+" flies downward, altitude : "+this.getAltitude());
    }

    @Override
    public void land(){
        System.out.println(this.getName()+" lands on the ground.");
    }

    @Override
    public void cantLand(){
        System.out.println(this.getName()+" is too high, it can't lands.");
    }
}

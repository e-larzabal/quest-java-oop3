public class Eagle extends Bird implements Fly {

    // Attributes
    private boolean flying;
    private int altitude;

    // Constructor
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    // Getters
    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    // Setters
    public void setAltitude(int altitude) {
        if ( altitude>=0 ) {
            this.altitude = altitude;
        } else {
            this.altitude = 0;
        }
    }

    public void setFlying (boolean flying) { this.flying = flying; }


    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if ( !this.isFlying() ) {
            this.setFlying(true);
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public void ascend(int meters) {
        // Update altitude : ascend => + meters
        if ( this.isFlying() ) {
            this.setAltitude(this.getAltitude() + meters);
            System.out.println(this.getName()+" flies upward, altitude : " + this.getAltitude());
        }
    }

    @Override
    public void glide() {
        if ( this.isFlying() ) {
            System.out.println("It glides into the air.");
        }
    }

    @Override
    public void descend(int meters) {
        // Update altitude : descend => - meters
        if ( this.isFlying() ) {
            this.setAltitude(this.getAltitude() - meters);
            System.out.println(this.getName() + " flies downward, altitude : " + this.getAltitude());
        }
    }

    @Override
    public void land(){
        if ( this.isFlying() ) {
            if ( this.getAltitude()<= 1 ) {
                this.setAltitude(0);
                this.setFlying(false);
                System.out.println(this.getName() + " lands on the ground.");
            } else {
                System.out.println(this.getName() + " is too high, it can't lands.");
            }
        } else {
            System.out.println(this.getName() + " is not flying, it can't lands.");
        }
    }

}

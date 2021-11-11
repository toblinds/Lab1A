import java.awt.*;

public class Saab95 extends Car{

    /**
     * Boolean to control turbo on Saab
     */
    public boolean turboOn;

    /**
     * Constructor for Saab, using the constructor in Car. Sets turbo off for all new Saabs.
     */
    public Saab95(){
        super(2, Color.red, 125, "Saab95");
	    turboOn = false;
    }
    /**
     * Method to turn turbo on for Saab cars
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Method to turn turbo off for Saab cars
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * Method to get speedfactor for Saab
     * @return double speedFactor for Saab cars
     */
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) {
            turbo = 1.3;
        }
        return super.getEnginePower() * 0.01 * turbo;
    }
}

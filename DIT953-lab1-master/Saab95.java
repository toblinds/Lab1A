import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;
    
    public Saab95(){
        super(2, Color.red, 125, "Saab95");
	    turboOn = false;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return super.getEnginePower() * 0.01 * turbo;
    }
/*
    public void incrementSpeed(double amount){
        //super.setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
        super.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }
*/
    public void decrementSpeed(double amount){
        //super.setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        super.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

}

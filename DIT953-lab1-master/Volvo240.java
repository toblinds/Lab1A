import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    public Volvo240(){
        super(4, Color.black,100, "Volvo240");
    }

    //Hur kan vi komma åt speedFactor från Car? Kan slippa duplicerad kod och sätta fler metoder som privata.
    @Override
    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

    /*public void incrementSpeed(double amount){
        super.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }
*/
    public void decrementSpeed(double amount){
        super.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if(amount >= 0 && amount <= 1)
            incrementSpeed(amount);
        else{throw new RuntimeException("Value is not in gas interval");}
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(amount >= 0 && amount <= 1)
            decrementSpeed(amount);
        else{throw new RuntimeException("Value is not in break interval");}
    }
}

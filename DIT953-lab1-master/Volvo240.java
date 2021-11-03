import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    public Volvo240(){
        super(4, Color.black,100, "Volvo240");
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,super.getEnginePower());
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}

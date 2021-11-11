import java.awt.*;

public class Volvo240 extends Car{

    /**
     * Double to control the trimfactor of Volvos
     */
    private final static double trimFactor = 1.25;

    /**
     * Constructor for Volvo, using the constructor in Car
     */
    public Volvo240(){
        super(4, Color.black,100, "Volvo240");
    }

    /**
     * Method to get the speedfactor for Volvos, overrides abstract method speedFactor in Car
     * @return double speedFactor
     */
    @Override
    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }
}

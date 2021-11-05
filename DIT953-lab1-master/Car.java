import java.awt.*;

public class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private double x,y;
    private Color color; // Color of the car
    private String modelName; // The car model name
    private String currentDirection; //The direction of the car

    public Car(int nrDoors, Color color, double enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentDirection = "NORTH";
        this.stopEngine();
    }

    public int getNrDoors(){
    return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getX(){ return x; }

    public double getY(){ return y; }

    public Color getColor(){
        return color;
    }

    private void setColor(Color clr){
        color = clr;
    }

    public void setCurrentSpeed(double speed){ this.currentSpeed = speed; }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public void move() {
        if(currentDirection.equals("NORTH"))
            y -= currentSpeed;
        else if(currentDirection.equals("SOUTH"))
            y += currentSpeed;
        else if(currentDirection.equals("EAST"))
            x += currentSpeed;
        else if(currentDirection.equals("WEST"))
            x -= currentSpeed;
        else
            throw new RuntimeException("Unclear direction");
    }

    @Override
    public void turnLeft() {
        if(currentDirection.equals("NORTH"))
            currentDirection = "WEST";
        else if(currentDirection.equals("SOUTH"))
            currentDirection = "EAST";
        else if(currentDirection.equals("EAST"))
            currentDirection = "NORTH";
        else if(currentDirection.equals("WEST"))
            currentDirection = "SOUTH";
        else
            throw new RuntimeException("Unclear direction");
    }

    @Override
    public void turnRight() {
        if(currentDirection.equals("NORTH"))
            currentDirection = "EAST";
        else if(currentDirection.equals("SOUTH"))
            currentDirection = "WEST";
        else if(currentDirection.equals("EAST"))
            currentDirection = "SOUTH";
        else if(currentDirection.equals("WEST"))
            currentDirection = "NORTH";
        else
            throw new RuntimeException("Unclear direction");
    }

}

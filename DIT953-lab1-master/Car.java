import java.awt.*;

public abstract class Car implements Movable {

    /**
     * Number of doors on the car
     */
    private int nrDoors;
    /**
     * Engine power of the car
     */
    private double enginePower;
    /**
     * The current speed of the car
     */
    private double currentSpeed;
    /**
     * X-coordinate of the Car
     */
    private double x;
    /**
     * Y-coordinate of the Car
     */
    private double y;
    /**
     * Color of the car
     */
    private Color color;
    /**
     * The car model name
     */
    private String modelName;
    /**
     * The direction of the car
     */
    private String currentDirection;

    /**
     * Constructor for Car
     * @param nrDoors
     * @param color
     * @param enginePower
     * @param modelName
     */
    public Car(int nrDoors, Color color, double enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentDirection = "NORTH";
        this.stopEngine();
    }

    /**
     * Getter for the number of doors of the car
     * @return the car's number of doors
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * Getter for the engine power of the car
     * @return the car's engine power
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Getter for the current speed of the car
     * @return the car's current speed
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * Getter for the X-coordinate of the car
     * @return X-coordinate of the car
     */
    public double getX(){ return x; }

    /**
     * Getter for the Y-coordinate of the car
     * @return Y-coordinate of the coordinate
     */
    public double getY(){ return y; }

    /**
     * Getter for the color of the car
     * @return Color of the car
     */
    public Color getColor(){
        return color;
    }

    /**
     * Getter for the direction of the car
     * @return The current direction of the car
     */
    public String getCurrentDirection(){
        return currentDirection;
    }

    /**
     * Setter for the car's speed
     * @param speed Set the car's currentSpeed to chosen speed
     */
    private void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
    }

    /**
     * Starts the car's engine
     */
    private void startEngine(){
        currentSpeed = 0.1;
    }
    /**
     * Stops the car's engine
     */
    private void stopEngine(){
        currentSpeed = 0;
    }
    /**
     * Getter for model name
     * @return modelName Model name of the car
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Method to move the car in the current direction
     */
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
    }

    /**
     * Method to turn the car to the left
     */
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
    }

    /**
     * Method to turn the car to the right
     */
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
    }

    /**
     * Abstract method that is overridden by subclass speedFactor methods
     * @return the speedfactor
     */
    public abstract double speedFactor();

    /**
     * Method to increase the speed of the car
     * @param amount the amount of speed increase for the car
     */
    private void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    /**
     * Method to decrease the speed of the car
     * @param amount the amount of speed decrease for the car
     */
    private void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    /**
     * Method to accelerate the car
     * @param amount the amount of gas given
     */
    public void gas(double amount){
        if(currentSpeed == 0){
        startEngine();
    }
        if(amount >= 0 && amount <= 1)
            incrementSpeed(amount);
        else{throw new RuntimeException("Value is not in gas interval");}
    }

    /**
     * Method to decelerate the car
     * @param amount the amount of brake gives
     */
    public void brake(double amount){
        if(amount >= 0 && amount <= 1)
            decrementSpeed(amount);
        else{throw new RuntimeException("Value is not in break interval");}
        if(currentSpeed==0){
            stopEngine();
        }
    }

}

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class testCar {

    Car volvo = new Volvo240();
    Saab95 saab = new Saab95();

    @Test
    public void testEngine(){
        volvo.startEngine();
        assertTrue(volvo.getCurrentSpeed() == 0.1);
        volvo.stopEngine();
        assertTrue(volvo.getCurrentSpeed() == 0);
    }
    @Test (expected = RuntimeException.class)
    public void testGas(){
        volvo.gas(0.5);
        assertTrue(volvo.getCurrentSpeed() == 0.625);
        volvo.gas(2);
    }
    @Test (expected = RuntimeException.class)
    public void testBrake(){
        volvo.gas(1);
        volvo.brake(0.5);
        assertTrue(volvo.getCurrentSpeed() == 0.625);
        volvo.brake(2);
    }
    @Test
    public void testMove(){
        volvo.move();
        volvo.turnLeft();
        volvo.move();
        volvo.turnLeft();
        volvo.move();
        volvo.turnLeft();
        volvo.move();
        volvo.gas(0.5);
        volvo.move();
        assertTrue(volvo.getX() == 0.625);
    }
    @Test
    public void testTurnLeft(){
        volvo.turnLeft();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.NORTH);
        volvo.turnLeft();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.WEST);
        volvo.turnLeft();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.SOUTH);
        volvo.turnLeft();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.EAST);
    }
    @Test
    public void testTurnRight(){
        volvo.turnRight();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.EAST);
        volvo.turnRight();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.SOUTH);
        volvo.turnRight();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.WEST);
        volvo.turnRight();
        assertTrue(volvo.getCurrentDirection() == Car.Direction.NORTH);
    }
    @Test
    public void testGetModelName(){
        assertTrue(volvo.getModelName().equals("Volvo240"));
    }
    @Test
    public void testGetColor(){
        assertTrue(volvo.getColor() == Color.black);
    }
    @Test
    public void testGetY(){
        volvo.gas(0.5);
        volvo.move();
        assertTrue(volvo.getY() == -0.625);
    }
    @Test
    public void testGetX(){
        volvo.gas(0.5);
        volvo.turnRight();
        volvo.move();
        assertTrue(volvo.getX() == 0.625);
    }
    @Test
    public void testGetNrDoors(){
        assertTrue(volvo.getNrDoors() == 4);
    }
    @Test
    public void testTurboOff(){
        saab.setTurboOff();
        assertTrue(!saab.turboOn);
    }
    @Test
    public void testTurboOn(){
        saab.setTurboOn();
        assertTrue(saab.turboOn);
    }
    @Test
    public void TestSpeedFactorTurboOn(){
        saab.setTurboOn();
        saab.speedFactor();
        assertTrue(saab.getEnginePower() * 0.01 * 1.3 == 1.625);
    }
    @Test
    public void TestSpeedFactorTurboOff(){
        saab.setTurboOff();
        assertTrue(saab.getEnginePower() * 0.01 * 1.0 == 1.25);
    }
}

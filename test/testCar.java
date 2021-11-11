import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class testCar {

    Car volvo = new Volvo240();
    Saab95 saab = new Saab95();

    @Test
    public void testGas(){
        volvo.gas(0.5);
        assertTrue(volvo.getCurrentSpeed()==0.725);
        volvo.gas(2);
    }
    @Test
    public void testBrake(){
        volvo.brake(0.5);
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
    }
    @Test
    public void testTurnLeft(){
        volvo.turnLeft();
        volvo.turnLeft();
        volvo.turnLeft();
        volvo.turnLeft();
    }
    @Test
    public void testTurnRight(){
        volvo.turnRight();
        volvo.turnRight();
        volvo.turnRight();
        volvo.turnRight();
    }
    @Test
    public void testGetModelName(){
        volvo.getModelName();
    }
    @Test
    public void testGetColor(){
        volvo.getColor();
    }
    @Test
    public void testGetY(){
        volvo.getY();
    }
    @Test
    public void testGetX(){
        volvo.getX();
    }
    @Test
    public void testGetNrDoors(){
        volvo.getNrDoors();
    }
    @Test
    public void testTurboOff(){
        saab.setTurboOff();
    }
    @Test
    public void testTurboOn(){
        saab.setTurboOn();
    }
    @Test
    public void TestSpeedFactor(){
        saab.setTurboOn();
        saab.speedFactor();
    }
}

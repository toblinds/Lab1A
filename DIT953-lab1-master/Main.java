public class Main {
//Ska vi kunna köra båda bilarna samtidigt eller räcker det med att man kör en av dem i taget?
// Synlighet på metoder osv. private?
    public static void main(String[]args){

        Volvo240 v = new Volvo240();
        Saab95 w = new Saab95();
        System.out.println(v.speedFactor());
        w.setTurboOn();
        System.out.println(w.speedFactor());

        System.out.println(v.getCurrentSpeed());
        v.gas(1);
        System.out.println(v.getCurrentSpeed());
        v.move();
        v.move();
        v.turnLeft();
        v.move();
        System.out.println(v.getY());
        System.out.println(v.getX());
        System.out.println(v.getCurrentSpeed());
        v.incrementSpeed(0.5);
        System.out.println(v.getCurrentSpeed());
        System.out.println(w.getCurrentSpeed());
        w.incrementSpeed(0.5);
        System.out.println(w.getCurrentSpeed());

    }

}

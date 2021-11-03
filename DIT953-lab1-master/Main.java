public class Main {

    public static void main(String[]args){

        Volvo240 v = new Volvo240();
        Saab95 w = new Saab95();
        System.out.println(v.speedFactor());
        w.setTurboOn();
        System.out.println(w.speedFactor());
    }

}

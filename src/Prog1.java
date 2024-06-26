public class Prog1 {

    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);

        double piPowerX = Math.pow(Math.PI, x);

        int y = RandomNumbers.getRandomInt(3, 14);

        double yPowerPi = Math.pow(y, Math.PI);

        System.out.println("Random number x in range 1..9: " + x);
        System.out.println("π^x: " + piPowerX);
        System.out.println("Random number y in range 3..14: " + y);
        System.out.println("y^π: " + yPowerPi);
    }
}

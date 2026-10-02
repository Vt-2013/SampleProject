public class Experiment {
    public static void main(String[] args) {

        // Calculate (2^3)^3 + (3^2)^2
        int result = (int) Math.pow(Math.pow(2, 3), 3) + (int) Math.pow(Math.pow(3, 2), 2);

        System.out.println("The result is: " + result);
    }
}

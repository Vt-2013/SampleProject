
public class Binary {
    public static void main(String[] args) {
        String binaryStr = "101010100111111101";

        // Convert binary to decimal
        int decimal = Integer.parseInt(binaryStr, 2);

        System.out.println("Decimal equivalent of " + binaryStr + " is: " + decimal);
    }
}
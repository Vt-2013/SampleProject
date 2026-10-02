import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the First Number : ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Please enter the Second Number : ");
        BigInteger b = sc.nextBigInteger();
        if (a.compareTo(b) > 0){
            System.out.println(" "+b);
            System.out.println("+"+a);
        }
        else {
            System.out.println(" "+a);
            System.out.println("+"+b);
        }

        System.out.println("Ans => "+a.add(b));
    }
}

import java.util.Scanner;

public class Odd_and_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number between 1 to 50 : ");
        int Number = sc.nextInt();

        if (Number > 50 || Number < 1) {
            System.out.println("The Number provided is invalid!");
        }

        else if (Number % 2 == 0) {
            System.out.println("The Number is Even.");
        }

        else {
            System.out.println("The Number is Odd.");
        }
    }
}

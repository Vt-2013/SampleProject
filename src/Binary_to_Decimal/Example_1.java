package Binary_to_Decimal;

import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Binary Number = ");
        int Binary_Num = sc.nextInt();
        int Ans = 0; //Converted Decimal Number
        int Pw = 1; //2 ^ 0 = 1; Pw = Power of Two;
        while (Binary_Num > 0){
            int Unit_Digit = Binary_Num % 10;
            Ans += (Unit_Digit * Pw);
            Binary_Num /= 10;
            Pw *= 2;

        }
        System.out.println("The Number is "+Ans+".");
    }
}

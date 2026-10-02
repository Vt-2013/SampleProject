package Decimal_to_Binary;

import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the decimal number = ");
        int Decimal_Num = sc.nextInt();
        int Ans = 0; //Binary_Num
        int Pw = 1; //Pw = Power: // Powers of 10;
        while (Decimal_Num > 0){
            int Parity = Decimal_Num % 2;
            Ans += (Parity * Pw);
            Pw *= 10;
            Decimal_Num /= 2;
        }
        System.out.println(Ans);
    }
}

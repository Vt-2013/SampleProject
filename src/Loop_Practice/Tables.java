package Loop_Practice;

import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number (for a table of the number you will enter) : ");
        int n = sc.nextInt();

        System.out.println("The table of "+n+" is :");
        int Num_to_Multiply_by_N;

        for (Num_to_Multiply_by_N = 1;Num_to_Multiply_by_N <= 10;Num_to_Multiply_by_N++){
            System.out.println(n+" * "+Num_to_Multiply_by_N+" = "+n*Num_to_Multiply_by_N);
        }
    }
}

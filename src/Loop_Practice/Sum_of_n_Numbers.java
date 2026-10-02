package Loop_Practice;
import java.util.*;
public class Sum_of_n_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Number : ");
        int n = sc.nextInt();
        int Sum  =  0;
        for (int i = 1;i <= n; i++){
        Sum = Sum + i;
        }
        System.out.println("Sum of "+n+" Numbers is "+Sum+".");
    }
}

import java.util.Scanner;

public class Array_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {10, 20, 30, 40, 50};

        System.out.print("Please, enter the number you want to check in the Array List: ");
        int target = sc.nextInt();

        boolean TargetFound = false;

        for (int num : a) {
            if (num == target) {
                TargetFound = true;
                break;
            }
        }

        if (TargetFound) {
            System.out.println("The element has been found in the Array list.");
        }
        else {
            System.out.println("The element is not existing in the Array list... Sorry.");
        }

        sc.close();
    }
}

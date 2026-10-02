import java.util.Scanner;

public class Area_and_Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Length and Breadth to find the Area and Perimeter : ");
        System.out.print("Length : ");
        double Length = sc.nextDouble();
        System.out.print("Breadth : ");
        double Breadth = sc.nextDouble();
        System.out.println("The Perimeter and the Area is : ");
        double Perimeter = 2*(Length + Breadth);
        System.out.printf("Perimeter => "+"%.2f",Perimeter);
        double Area = Length*Breadth;
        System.out.printf("Area => "+"%.2f",Area);

    }
}

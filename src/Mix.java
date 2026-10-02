public class Mix {
    public static void main(String[] args) {
        double Length=8.5;
        double Breadth=5.6;
        double Area=Length*Breadth;
        double Perimeter = 2*(Length+Breadth);
        System.out.printf("The Area is "+"%.1f * %.1f = %.1f\n",Length,Breadth,Area);
        System.out.printf("The Perimeter is " + "2*(%.1f * %.1f) = %.1f\n",Length,Breadth,Perimeter);
    }
}

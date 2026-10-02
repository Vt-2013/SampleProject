public class Mensuration {
    public static void main(String[] args) {
        double L=8.5;
        double B=5.6;
        double Perimeter=2*(L+B);
        double Area=L*B;
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n",L,B,Perimeter);
        System.out.printf("Area is %.1f * %.1f = %.1f\n",L,B,Area);

    }
}

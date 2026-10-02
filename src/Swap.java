public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Value of a ="+a);
        System.out.println("Value of b ="+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println("Now Value of a is :"+a);
        System.out.println("Now Value of b is :"+b);

    }
}

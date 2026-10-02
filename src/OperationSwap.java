public class OperationSwap {
    public static void main(String[] args) {
        int Number_1 = 32;
        int Number_2 = 64;

        int Number_3 = Number_1;

        Number_1 = Number_2;
        Number_2 = Number_3;

        System.out.println(Number_1/Number_2);
    }
}

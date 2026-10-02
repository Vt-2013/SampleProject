package Operators;

 class Increment_and_Decrement_Operators {
    public static void main(String[]args) {

        System.out.print("Incrementing");
        int a = 10;
          System.out.println(++a + a++ + a++);
        System.out.println(a);

        System.out.print("Decrementing");
        int b = 20;
        System.out.println(a - --a);
        System.out.println(a);
    }
}






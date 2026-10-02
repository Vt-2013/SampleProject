package Loops;

public class Do_While_and_For_Loop_Ex_1 {
    public static void main(String[] args) {
        int Num;
        for (Num = 32;Num <= 62;Num++){
            System.out.println("The number is currently updated to "+Num+".");
        }

        do {
            Num++;
            System.out.println("The number has finally been updated to "+Num--+".");
        }while (Num == 64);
    }
}

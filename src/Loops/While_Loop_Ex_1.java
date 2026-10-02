package Loops;

public class While_Loop_Ex_1 {
    public static void main(String[] args) {
        int N = 2;
        int Goal = 2048;
        while (N < Goal){
            System.out.println("N is still less than it's Goal");
            N = N*2;
        }
        System.out.println("Now N has finally reached it's goal.");
    }
}

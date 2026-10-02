package Operators;

public class Experiments {
    public static void main(String[]args) {
        int Age_of_the_Player = 2;
        String Ternary = (Age_of_the_Player<=5) ? "Bro, Teach the player how to walk.☠️" : (Age_of_the_Player<10) ? "Bro, Teach the player how to kick the ball.☠️" : (Age_of_the_Player<18) ? "The palyer is undergoing training sessions." : (Age_of_the_Player<24) ? "The player is in his Prime." :  (Age_of_the_Player<30) ? "The player's downfall has begun." : "The player is doomed 💀";
        System.out.println(Ternary);
    }
}

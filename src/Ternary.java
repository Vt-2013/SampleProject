public class Ternary {
    public static void main(String[] args) {
        /*int a = 11;
        String MyVar = (a%2 == 0) ? "The Number is Even." : "The Number is Odd.";
        System.out.println(MyVar);*/
        int Score=98;
        String Grade = (Score>=90) ? "got A Grade" : (Score>=80) ? "got B Grade" : (Score>=70) ? "got C Grade" : (Score>=60) ? "got D Grade" : (Score>=50) ? "got E Grade" : (Score>=40) ? "got F Grade" : "Failed";
        System.out.println("You have " +Grade+".");

    }
}
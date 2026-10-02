import java.util.Scanner;
public class Security {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = "Vidhan Tiwari";
        String Class_and_Section = "VII D";
        String Admission_Number = "11283/24";
        String Attendance = "100%";
        String Assignments =
                "1) Mathematics: Complete Pythagoras Theorem Exercise 1, 2, 3, and 4 in your notebook.\n" +
                        "2) English: Write a paragraph on Nuclear Wars.\n" +
                        "3) Social Science: Solve the Worksheet given for Chapter No.- 5 India's Cultural Roots.\n" +
                        "4) Science: Make a project on Molecular Chemical Compounds.\n";
        String E_Mail_ID = "vidhantsis@gmail.com";
        String Password_of_the_E_Mail_ID = "Hello World";
        String Age = "20 yrs.";
        String Preferences = "Gaming\n"+"Game Making\n"+"Graphic Designing\n"+"Coding";

        System.out.println("Please set your Username and Password : ");
        System.out.print("Username : ");
        String Username = sc.nextLine();
        System.out.print("Password : ");
        String Password = sc.nextLine();

        System.out.println("\n><><=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+><><\n");
        System.out.println("Now Please Verify Your Username and Password : ");
        System.out.print("Username : ");
        String Username_1 = sc.nextLine();
        System.out.print("Password : ");
        String Password_1 = sc.nextLine();

        if (Username_1.equals(Username) && Password_1.equals(Password)) {
            System.out.println("\n**Your Username and Password has been Verified**");
            System.out.println("\n><><=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+><><");
            System.out.println("\nNow Please Sign-In to See Student Details : \n");
            System.out.print("Username : ");
            String Username_2 = sc.nextLine();
            System.out.print("Password : ");
            String Password_2 = sc.nextLine();

            if (Username_2.equals(Username_1) && Password_2.equals(Password_1)) {
                System.out.println("\nYour Username and Password is Correct.");
                System.out.println("\nSending You Ahead for Further Authorization : ");
                System.out.println("\n><><=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+=-=+><><\n");
                System.out.println("Now Please Choose One of the Following Options below : ");
                System.out.println("1. Name ");
                System.out.println("2. Age ");
                System.out.println("3. Class and Section ");
                System.out.println("4. Admission Number ");
                System.out.println("5. Preferences ");
                System.out.println("6. E-Mail ID Information ");
                System.out.println("7. Assignments ");
                System.out.println(" Now Please Pick a Serial Number of the Choices given Above : ");
                System.out.print("Choice : ");
                int Choice = sc.nextInt();
                if (Choice==1){
                    System.out.println("The Name of the Student is : "+Name);
                }
                if (Choice==2){
                    System.out.println("The Age of the Student is : "+Age);
                }
                if (Choice==3){
                    System.out.println("Class and Section of the Student are : "+Class_and_Section);
                }
                if (Choice==4){
                    System.out.println("The Admission Number of the Student is : "+Admission_Number);
                }
                if (Choice==5){
                    System.out.println("The Preferences of the Student are : "+Preferences);
                }
                if (Choice==6){
                    System.out.println("E-Mail ID of the Student is : "+E_Mail_ID);
                    System.out.println("Password of the E-Mail ID of the Student is : "+Password_of_the_E_Mail_ID);
                }
                if (Choice==7){
                    System.out.println("The Assigned Assignments for the Student are : "+Assignments);
                }
                else if (Choice!=1 || Choice!=2 || Choice!=3 || Choice!=4 || Choice!=5 || Choice!=6 || Choice!=7) {
                    System.out.println("Please Pick a Serial Number of the Choices Given Above. ");
                }
            }

            else if (!Username_2.equals(Username_1) || !Password_2.equals(Password_1)){
                System.out.println("\nEither Your Username or Password is Incorrect.");
            }

            else if (!Username_2.equals(Username_1) && !Password_2.equals(Password_1)){
                System.out.println("\nBoth Your Username and Password is Incorrect.");
            }
        }

        else if (!Username_1.equals(Username) || !Password_1.equals(Password)) {
            System.out.println("Either Your Username or Password is Incorrect in Verification Step.");
        }

        else {
            System.out.println("Both Your Username and Password is Incorrect in Verification Step.");
        }
    }
}

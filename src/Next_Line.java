import java.util.Scanner;
public class Next_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Username and Password for further authorization : ");
        System.out.print("Username : ");
        String Username = sc.nextLine();
        System.out.print("Password : ");
        String Password = sc.nextLine();

        if (Username.equals("NEL_Fake_Volley") && Password.equals("Black_Ops_6")) {
            System.out.println("Your Username and Password is correct.");
        }
        else if (!Username.equals("NEL_Fake_Volley") && !Password.equals("Black_Ops_6")) {
            System.out.println("Both Username and Password are incorrect.");
        }
        else if (!Username.equals("NEL_Fake_Volley") || !Password.equals("Black_Ops_6")) {
            System.out.println("Either your Username or Password is incorrect.");
        }

    }
}


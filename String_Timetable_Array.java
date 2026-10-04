import java.util.Scanner;

public class String_Timetable_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] Timetable_MTWTFS = {"""
                2:45 - 4:00 (Coming back from school and Eating food.)
                4:00 - 4:30 (Watching T.V. or whatever I want to do)
                4:30 - 7:00 (Studying or doing my homework)
                7:00 - 8:00 (Walking with Dadu)
                8:00 - 9:00 (Guitar Practice at home)
                9:00 - 9:45 (Eating Dinner)
                9:45 - 10:45 (Learning Java on my own)""",
                """
                2:45 - 4:00 (Coming back from school and Eating food.)
                4:00 - 4:30 (Watching T.V. or whatever I want to do)
                4:30 - 5:45 (Studying or doing my homework)
                5:45 - 5:55 (Getting ready for Guitar Class)
                6:00 - 7:15 (Guitar Class)
                7:20 - 8:20 (Walking with Dadu)
                8:20 - 9:00 (Learning Java on my own)
                9:00 - 9:45 (Eating Dinner)"""};

        System.out.print("Enter the day you want to see the timetable of : ");
        String Day = sc.nextLine();

        Day = Day.substring(0, 1).toUpperCase() + Day.substring(1).toLowerCase();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (Day.equalsIgnoreCase("Monday") || Day.equalsIgnoreCase("Wednesday") || Day.equalsIgnoreCase("Friday")) {
            System.out.println("\nTimetable for " + Day + " is:\n\n" + Timetable_MTWTFS[0]);
        }

        else if (Day.equalsIgnoreCase("Tuesday") || Day.equalsIgnoreCase("Thursday") || Day.equalsIgnoreCase("Saturday")) {
            System.out.println("\nTimetable for " + Day + " is:\n\n" + Timetable_MTWTFS[1]);
        }

        else if (Day.equals("Sunday")) {
            System.out.println("Holiday, Enjoy!");
        }

        else {
            System.out.println("\nThere is no such day in the week as " + Day + ".");
        }
    }
}
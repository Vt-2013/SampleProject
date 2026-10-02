package Binary_to_Text_and_Text_to_Binary;

import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Text to Binary\n2. Binary to Text");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            System.out.println("Binary: " + textToBinary(text));
        } else if (choice == 2) {
            System.out.print("Enter binary (8 bits per character, space-separated): ");
            String binary = scanner.nextLine();
            System.out.println("Text: " + binaryToText(binary));
        } else {
            System.out.println("Invalid option!1");
        }
    }

    public static String textToBinary(String text) {
        StringBuilder binary = new StringBuilder();
        for (char c : text.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0')).append(" ");
        }
        return binary.toString().trim();
    }

    public static String binaryToText(String binaryStr) {
        String[] binaries = binaryStr.split(" ");
        StringBuilder text = new StringBuilder();
        for (String bin : binaries) {
            int charCode = Integer.parseInt(bin, 2);
            text.append((char) charCode);
        }
        return text.toString();
    }
}
import java.util.Scanner;

public class PracticalAssigment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        int space = 0;
        int alphabet = 0;
        int character = 0;

        System.out.print("Enter the string ");
        String value = sc.nextLine();
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isLetter(ch))
                alphabet++;
            else if (Character.isDigit(ch))
                digit++;
            else if (Character.isWhitespace(ch))
                space++;
            else
                character++;
        }
        System.out.println("letter is " + alphabet + " digit is " + digit + " space is " + space
                + " and other character is " + character);
        sc.close();
    }
}

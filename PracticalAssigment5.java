import java.util.*;

public class PracticalAssigment5 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string ");
        String value = sc.nextLine();
        for (int i = 0; i < value.length(); i++) {
            string.append(value.charAt(value.length() - i - 1));
        }
        string.toString();
        System.out.println("Your reverse string is the " + string);
        sc.close();
    }
}

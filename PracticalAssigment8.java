import java.util.Scanner;

public class PracticalAssigment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String value = sc.nextLine();
        String[] arr = value.split("\\s");
        String capitlized = "";
        for (String string : arr) {
            String singleword = string.substring(0,1);
            String extra = string.substring(1);
            capitlized += singleword.toUpperCase() + extra + " ";
        }
        System.out.println(capitlized);
        sc.close();
    }
}

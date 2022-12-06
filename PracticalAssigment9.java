import java.util.Scanner;

public class PracticalAssigment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your string ");
        char ch = sc.next().charAt(0);
        System.out.println("Your character ascci value is the " + (int) ch);
        sc.close();
    }
}

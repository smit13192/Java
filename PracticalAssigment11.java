import java.util.Scanner;

public class PracticalAssigment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your number ");
        int number = sc.nextInt();
        int reverse_number = 0;
        while (number != 0) {
            reverse_number = reverse_number * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(reverse_number);
        sc.close();
    }
}

import java.util.*;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your number ");
		String number = sc.next();
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt(String.valueOf(number.charAt(i)));
		}
		System.out.println("Your answer is " + sum);
		sc.close();
	}
}
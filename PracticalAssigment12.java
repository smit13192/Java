import java.util.Scanner;

public class PracticalAssigment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number enter in the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("what is your " + (i + 1) + " number ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];
        System.out.println("maximum number is the " + max);
        sc.close();
    }
}

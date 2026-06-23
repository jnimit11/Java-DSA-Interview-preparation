import java.util.Scanner;

public class ip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur of firstNum: ");
        int firstNum = sc.nextInt();
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of secondNum: ");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer of both is: " + ans);

        sc.close();

    }
}
import java.util.Scanner;

public class armstrong3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number :");
        int num = sc.nextInt();
        sc.close();
        int originalNumber, remainder, result = 0;

        originalNumber = num;
        if(num >=100 && num <= 999)
        {
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        }
        else{
            System.out.println("Enter 3 digit number only.");
        }
    }
}

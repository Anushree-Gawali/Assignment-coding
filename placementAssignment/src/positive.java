import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if(a >= 0)
        {
            System.out.println("given number is positive number");
        }
        else{
            System.out.println("given number is negative number");
        }
    }
}

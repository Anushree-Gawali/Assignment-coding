import java.util.Scanner;

public class swapNoVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        sc.close();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " "+b);

    }
}

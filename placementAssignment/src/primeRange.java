import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b value: ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int flag;
        for (int i = a; i <= b; i++) {
 
            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;
 
            flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
        }
            if (flag == 1)
                System.out.println(i);
    }
}
}

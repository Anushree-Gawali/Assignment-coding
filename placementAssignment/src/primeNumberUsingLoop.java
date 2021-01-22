import java.util.*;
class primeNumberUsingLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int m=0, i;
        int flag=0;
        m=n/2;
        if(n == 0 || n == 1)
        {
            System.out.println("Given number is prime number");
        }
        for(i=2;i<=m; i++)
        {
            if(n%i == 0)
            {
                System.out.println("Given number is not prime number");
            }
            flag =1;
        }
        if(flag == 0)
        {
            System.out.println("prime number");
        }

    }
}
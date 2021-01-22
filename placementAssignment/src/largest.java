import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a > b && a>c)
        {
            System.out.println("Largest number : "+a);
        }
        else if(b > a && b>c)
        {
            System.out.println("Largest number : "+b);
        }
        else
        {
            System.out.println("Largest number : "+c);
        } 
        
    }
}

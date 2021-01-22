import java.util.Scanner;

public class fiboseries {
    public static void main(String[] args) {
       
        int n1=0,n2=1,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int c = sc.nextInt();
        sc.close();
        System.out.print(n1+"+"+n2);
        for(int i=2;i<100; ++i){
            n3 = n1 + n2;
            if(n3<= c){
            System.out.print("+"+n3);
            }
            else 
                break;
            n1=n2;
            n2=n3;
        }
    }
}


import java.util.Scanner;

public class octalBinary {
    public static void main(String[] args) {
        int octnum,quot, i=1, j;
        int binnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextInt();
		scan.close();
        quot = octnum;
		
        while(quot != 0)
        {
            binnum[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Equivalent Binary Value of " +octnum+ " is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }
    }
}

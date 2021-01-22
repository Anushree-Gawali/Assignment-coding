import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        sc.close();
        if(a == 'a' || a == 'e' || a == 'o' || a == 'i' || a == 'u' ||
            a == 'A' || a == 'E' || a == 'O' || a == 'I' || a == 'U')
            {
               System.out.println("given character is vowel"); 
            }
            else
            {
                System.out.println("given character is consonant");
            }
    }
}

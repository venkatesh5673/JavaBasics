package If_Else;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        great();
    }
    public static void great()
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter value of c: ");
        c = scanner.nextInt();

        System.out.println("Greatest:");
        if (a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>c && b>a)
        {
            System.out.println(b);
        }
        else if (c>a && c>b)
        {
            System.out.println(c);
        }

        scanner.close();
    }
}

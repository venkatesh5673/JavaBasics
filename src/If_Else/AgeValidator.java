package If_Else;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Age :");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age >= 18 && age <= 30 ){
            System.out.println("Youngster");
        }
        else if (age < 18 )
        {
            System.out.println("Kid");
        }
        else {
            System.out.println("Uncle");
        }
        scanner.close();
    }
}

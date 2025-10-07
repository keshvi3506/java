
import java.util.Scanner;

public class Basic_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();
        sc.nextLine(); 
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); 

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        sc.close();
    }
}

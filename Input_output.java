import java.util.Scanner;

public class Input_output {
    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        System.out.println(num); 
    }

    public static void main(String[] args) {
        printNumber(); // call the function
    }
}

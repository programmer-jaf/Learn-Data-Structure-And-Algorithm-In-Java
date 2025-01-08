import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the traffic light color (red, yellow, green): ");
        String lightColor = scanner.nextLine().toLowerCase();
        
        if (lightColor.equals("red")) {
            System.out.println("Stop");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Slow down");
        } else if (lightColor.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }
        
        scanner.close();
    }
}
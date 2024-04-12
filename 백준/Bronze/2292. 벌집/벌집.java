import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int range = 1;
        int increment = 6;
        
        while (N > range) {
            count++; 
            range += increment;
            increment += 6;
        }
        
        System.out.println(count);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a      = sc.nextLine();

        sc.close();

        String[] s = a.split(" ");
        int      b = 0;

        for(String str: s){
            int i = Integer.parseInt(str);
            b += i * i;
        }

        System.out.println(b%10);
    }
}
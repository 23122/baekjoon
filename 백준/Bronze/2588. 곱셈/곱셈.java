import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        main2(a,b);
        in.close();
    }
    public static void main2(int A, int B){
        System.out.println(A*(B%10));
        System.out.println(A*(((B%100)-(B%10))/10));
        System.out.println(A*(((B%1000)-(B%100))/100));
        System.out.println(A*B);
    }
}
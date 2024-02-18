import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a/b;
        if(0 < a || b < 10){
            System.out.println(result);
        }
        sc.close();
    }
}

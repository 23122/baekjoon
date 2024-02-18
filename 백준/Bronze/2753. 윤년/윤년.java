import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        switch (a%4){
            case 0:
                if(a%100!=0||a%400==0){
                    System.out.println("1"); break;
                }
            default : System.out.println("0"); break;
        }
        in.close();
    }
}
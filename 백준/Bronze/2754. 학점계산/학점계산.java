import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        switch(str){
            case "A+": str = "4.3"; break;
            case "A0": str = "4.0"; break;
            case "A-": str = "3.7"; break;
            case "B+": str = "3.3"; break;
            case "B0": str = "3.0"; break;
            case "B-": str = "2.7"; break;
            case "C+": str = "2.3"; break;
            case "C0": str = "2.0"; break;
            case "C-": str = "1.7"; break;
            case "D+": str = "1.3"; break;
            case "D0": str = "1.0"; break;
            case "D-": str = "0.7"; break;
            default : str = "0.0"; break;
        }
        System.out.print(str);
        in.close();
    } 
}
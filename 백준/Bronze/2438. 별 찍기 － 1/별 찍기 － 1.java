import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int x=1;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a-b;
        if(result >= -8){
            System.out.println(result);
        }
        sc.close();
	}
}
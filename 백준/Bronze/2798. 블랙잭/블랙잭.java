import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line   = br.readLine().split(" ");
        String[] list   = br.readLine().split(" ");
        int[]    num    = new int[list.length];
        int      target = Integer.parseInt(line[1]);
        int      max    = 0;

        for(int i = 0 ; i < list.length ; i++){
            num[i] = Integer.parseInt(list[i]);
        }

        outerloop:
        for(int j = 0 ; j < num.length - 2 ; j++){
            for(int n = j + 1 ; n < num.length - 1 ; n++){
                for(int m = n + 1 ; m < num.length ; m++){
                    int sum = num[j] + num[n] + num[m];
                    if(target >= sum){
                        max = Math.max(max,sum);
                    }

                    if(max == target){
                        break outerloop;
                    }
                }
            }
        }

        bw.write(String.valueOf(max));

        bw.flush();
        bw.close();
    }
}

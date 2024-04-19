import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br     = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw     = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> list = new LinkedList<>();
        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0 ; i < cnt ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > 0){
                list.offer(num);
            }else {
                if(list.size() > 0){
                    list.pollLast();
                }
            }
        }

        for(int num : list){
            sum += num;
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}


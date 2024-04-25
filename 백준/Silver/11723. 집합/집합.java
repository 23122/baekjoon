import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            int num;

            switch (action){
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    if(!queue.contains(num)){
                        queue.offer(num);
                    }
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    queue.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if(queue.contains(num)){
                        bw.write("1");
                    }else{
                        bw.write("0");
                    }
                    bw.newLine();
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if(!queue.contains(num)){
                        queue.offer(num);
                    }else{
                        queue.remove(num);
                    }
                    break;
                case "all":
                    queue.clear();
                    for(int j = 1 ; j<=20 ; j++){
                        queue.offer(j);
                    }
                    break;
                case "empty":
                    queue.clear();
                    break;
                default: break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

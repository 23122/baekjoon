import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> hashMap = new HashMap<>();
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            hashMap.put(st.nextToken(), i);
        }

        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(hashMap.containsKey(name)){
                treeMap.put(name, i);
            }
        }

        bw.write(String.valueOf(treeMap.size()));
        bw.newLine();

        for(String str : treeMap.keySet()){
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

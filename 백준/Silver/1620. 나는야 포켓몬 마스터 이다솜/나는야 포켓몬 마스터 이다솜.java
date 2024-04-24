import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt      = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        list.add(0,"");

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            hashMap.put(name, i + 1);
            list.add(name);
        }

        for(int j = 0 ; j < question ; j++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.chars().allMatch(Character::isDigit)){
                bw.write(list.get(Integer.parseInt(str)));
                bw.newLine();
            }else {
                bw.write(String.valueOf(hashMap.get(str)));
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

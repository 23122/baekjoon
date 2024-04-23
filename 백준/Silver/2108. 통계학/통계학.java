import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int   cnt   = Integer.parseInt(st.nextToken());
        int[] nums  = new int[cnt];
        int[] count = new int[8001];
        int   sum   = 0;
        int   max   = Integer.MIN_VALUE;
        int   min   = Integer.MAX_VALUE;

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
            sum += nums[i];
            count[nums[i] + 4000]++;
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        Arrays.sort(nums);

        List<Integer> feq = new ArrayList<>();
        int feqNum = count[0];
        feq.add(-4000);
        for (int i = 1; i < count.length; i++) {
            if(count[i] == feqNum) {
                feq.add(i - 4000);
            } else if(count[i] > feqNum) {
                feqNum = count[i];
                feq.clear();
                feq.add(i - 4000);
            }
        }

        if(feq.size() > 1) {
            Collections.sort(feq);
            feqNum = feq.get(1);
        }else {
            feqNum = feq.get(0);
        }

        bw.write(String.valueOf(Math.round( (double) sum / (double) cnt)));bw.newLine();
        bw.write(String.valueOf(nums[(int) Math.floor(cnt / 2)]));bw.newLine();
        bw.write(String.valueOf(feqNum));bw.newLine();
        bw.write(String.valueOf(max - min));

        bw.flush();
        br.close();
        bw.close();
    }
}

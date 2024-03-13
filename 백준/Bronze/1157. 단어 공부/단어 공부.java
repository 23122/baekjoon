import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toLowerCase();
        char[] cnt = new char[26];

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                cnt[index]++;
            }
        }
        int  maxCount   = -1;
        char resultChar = '?';

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCount) {
                maxCount = cnt[i];
                resultChar = (char) (i + 'A');
            } else if (cnt[i] == maxCount) {
                resultChar = '?';
            }
        }

        bw.write(String.valueOf(resultChar));

        bw.flush();
        bw.close();
    }
}
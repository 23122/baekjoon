import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Member> members = new ArrayList<>();
        int          cnt     = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++){
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];
            members.add(new Member(age, name));
        }

        Collections.sort(members);

        for (Member member : members) {
            bw.write(member.age + " " + member.name);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static class Member implements Comparable<Member> {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int compareTo(Member other) {
            if (this.age == other.age) {
                return 0;
            } else {
                return Integer.compare(this.age, other.age);
            }
        }
    }
}

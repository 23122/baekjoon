import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] today     = br.readLine().split(" ");
        String[] targetDay = br.readLine().split(" ");

        LocalDate now    = LocalDate.of(Integer.parseInt(today[0]),Integer.parseInt(today[1]),Integer.parseInt(today[2]));
        LocalDate target = LocalDate.of(Integer.parseInt(targetDay[0]),Integer.parseInt(targetDay[1]),Integer.parseInt(targetDay[2]));

        long result = ChronoUnit.DAYS.between(now,target);

        if(now.plusYears(1000).isBefore(target) || now.plusYears(1000).isEqual(target)){
            bw.write("gg");
        }else{
            bw.write("D-"+result);
        }
        bw.flush();
        bw.close();
    }
}
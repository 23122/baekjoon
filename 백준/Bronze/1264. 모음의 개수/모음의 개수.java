import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       char arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}; //모음 대 소문자 배열에 담기
       int cnt=0; //모음 몇개 들어갔나 확인할 변수
       while(true) {
           String str = bf.readLine();
            if(str.equals("#")){ //#이 입력되면 while문 탈출
                break;
            }
            for(int i = 0; i<str.length(); i++) { //str.charAt 사용해 한글자 한글자 모음인가 확인
                for(int j = 0; j<10; j++){ //모음 배열 돌ㄹㅕ~
                    if(str.charAt(i) == arr[j]) { //str.charAt(i)가 모음이면
                        cnt++; // 하나 추가
                        break;
                    }
                }
            }
            System.out.println(cnt); //모음 총 개수 확인
            cnt = 0; //다시 돌려야 하니 0으로 초기화
        }
   }
}

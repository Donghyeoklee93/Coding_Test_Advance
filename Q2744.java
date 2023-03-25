import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2744 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer word = new StringBuffer(br.readLine());

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char) ('a' + ch - 'A'));
            } else {
                System.out.print((char) ('A' + ch - 'a'));
            }
        }
    }
}